package com.gdou.car.business.user.service.impl;

import com.gdou.car.business.user.constants.UserResponseCodeEnum;
import com.gdou.car.business.user.dal.dto.*;
import com.gdou.car.business.user.dal.entitys.*;
import com.gdou.car.business.user.dal.persistence.UserBaseInfoMapper;
import com.gdou.car.business.user.dal.persistence.UserDetailInfoMapper;
import com.gdou.car.business.user.dal.persistence.UserRoleMapper;
import com.gdou.car.common.exception.ExceptionUtil;
import com.gdou.car.common.exception.ServiceException;
import com.gdou.car.common.exception.ValidateException;
import com.gdou.car.business.user.service.UserService;
import com.gdou.car.business.user.utils.JwtTokenUtils;
import com.gdou.car.common.utils.RandomUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/15 17:20
 */
@Service
public class UserServiceImpl implements UserService {
    
    Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private UserBaseInfoMapper userBaseInfoMapper;
    
    @Autowired
    private UserDetailInfoMapper userDetailInfoMapper;
    
    @Autowired
    private UserRoleMapper userRoleMapper;
    
    
    @Override
    public UserLoginResponse login(UserLoginRequest request) {
        Log.info("login request:" + request);
        UserBaseInfoExample userExample = new UserBaseInfoExample();
        UserBaseInfoExample.Criteria criteria = userExample.createCriteria();
        
        UserLoginResponse response = new UserLoginResponse();
        try {
            beforeValidate(request);
            criteria.andUserNameEqualTo(request.getUserName());
            List<UserBaseInfo> users = userBaseInfoMapper.selectByExample(userExample);
            if (CollectionUtils.isEmpty(users) || !users.get(0).getUserPassword().equals(request.getUserPassword())) {
                // 用户名或密码不存在
                response.setCode(UserResponseCodeEnum.USERORPASSWORD_ERRROR.getCode());
                response.setMsg(UserResponseCodeEnum.USERORPASSWORD_ERRROR.getMsg());
                return response;
            }
            UserBaseInfo user = users.get(0);
            Map<String, Object> map = new HashMap<>();
            map.put("uid", user.getUserId());
            map.put("exp", DateTime.now().plusDays(1).toDate().getTime() / 1000); // token有效期
            
            response.setToken(JwtTokenUtils.generatorToken(map));
            
            response.setUserId(user.getUserId());
            response.setUserName(user.getUserName());
            response.setCode(UserResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(UserResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("login occur exception :" + e);
            ServiceException serviceException = (ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMsg(serviceException.getErrorMessage());
        } finally {
            Log.info("login response->" + response);
        }
        
        return response;
    }
    
    @Override
    public CheckAuthResponse validToken(CheckAuthRequest request) {
        CheckAuthResponse response = new CheckAuthResponse();
        try {
            beforeValidateAuth(request);
            
            Claims claims = JwtTokenUtils.phaseToken(request.getToken());
            response.setUid(claims.get("uid").toString());
            response.setCode(UserResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(UserResponseCodeEnum.SUCCESS.getMsg());
            
        } catch (ExpiredJwtException e) {
            Log.error("Expire :" + e);
            response.setCode(UserResponseCodeEnum.TOKEN_EXPIRE.getCode());
            response.setMsg(UserResponseCodeEnum.TOKEN_EXPIRE.getMsg());
        } catch (SignatureException e1) {
            Log.error("SignatureException :" + e1);
            response.setCode(UserResponseCodeEnum.SIGNATURE_ERROR.getCode());
            response.setMsg(UserResponseCodeEnum.SIGNATURE_ERROR.getMsg());
        } catch (Exception e) {
            Log.error("login occur exception :" + e);
            ServiceException serviceException = (ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMsg(serviceException.getErrorMessage());
        } finally {
            Log.info("response:" + response);
        }
        
        return response;
    }
    
    public UserRegisterResponse register(UserRegisterRequest userRegisterRequest) {
        Log.info("begin UserCoreService.register,request:【" + userRegisterRequest + "】");
        
        UserRegisterResponse response = new UserRegisterResponse();
        try {
            beforeRegisterValidate(userRegisterRequest);
            userNameValidate(userRegisterRequest);
            phoneNumberValidate(userRegisterRequest);
            
            UserBaseInfo user = new UserBaseInfo();
            // 生成用户id
            Long userId = Long.parseLong(RandomUtils.generateNum(18));
            BeanUtils.copyProperties(userRegisterRequest, user);
            user.setUserId(userId);
    
            UserDetailInfo userDetailInfo = new UserDetailInfo();
            BeanUtils.copyProperties(userRegisterRequest, userDetailInfo);
            userDetailInfo.setUserId(userId);
    
            UserRole userRole = new UserRole();
            userRole.setUserId(userId);
            userRole.setRoleId(1);
            
            // 添加基本用户信息
            int effectRow = userBaseInfoMapper.insertSelective(user);
            // 添加用户详细信息
            int effectRow1 = userDetailInfoMapper.insertSelective(userDetailInfo);
            // 为用户添加角色
            int effectRow3 = userRoleMapper.insertSelective(userRole);
            if (effectRow > 0 && effectRow1 > 0 && effectRow3 > 0) {
                response.setCode(UserResponseCodeEnum.SUCCESS.getCode());
                response.setMsg(UserResponseCodeEnum.SUCCESS.getMsg());
                response.setUserId(userId);
                response.setUserName(userRegisterRequest.getUserName());
                return response;
            }
            
            // 添加失败
            response.setCode(UserResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(UserResponseCodeEnum.SYSTEM_BUSY.getMsg());
            return response;
        } catch (DuplicateKeyException e) {
            Log.info("主键重复");
        } catch (Exception e) {
            ServiceException serviceException = (ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMsg(serviceException.getErrorMessage());
        } finally {
            Log.info("register response:【" + response + "】");
        }
        
        return response;
    }
    
    private void beforeRegisterValidate(UserRegisterRequest request) {
        if (null == request) {
            throw new ValidateException("请求对象为空");
        }
        if (StringUtils.isEmpty(request.getUserName())) {
            throw new ValidateException("用户名为空");
        }
        if (StringUtils.isEmpty(request.getUserPassword())) {
            throw new ValidateException("密码为空");
        }
        if (StringUtils.isEmpty(request.getPhoneNumber())) {
            throw new ValidateException("手机号码为空");
        }
        if (StringUtils.isEmpty(request.getCredentialsId())){
            throw new ValidateException("身份证号不能为空");
        }
        if (StringUtils.isEmpty(request.getRealName())) {
            throw new ValidateException("真实姓名不能为空");
        }
    }
    
    private void userNameValidate(UserRegisterRequest request) {
        UserBaseInfoExample userBaseInfoExample = new UserBaseInfoExample();
        UserBaseInfoExample.Criteria criteria = userBaseInfoExample.createCriteria();
        criteria.andUserNameEqualTo(request.getUserName());
        List<UserBaseInfo> userBaseInfos = userBaseInfoMapper.selectByExample(userBaseInfoExample);
        if (userBaseInfos.size() > 0) {
            throw new ValidateException("用户名已注册");
        }
    }
    
    private void phoneNumberValidate(UserRegisterRequest request) {
        UserDetailInfoExample userDetailInfoExample = new UserDetailInfoExample();
        UserDetailInfoExample.Criteria criteria = userDetailInfoExample.createCriteria();
        criteria.andPhoneNumberEqualTo(request.getPhoneNumber());
        List<UserDetailInfo> userDetailInfos = userDetailInfoMapper.selectByExample(userDetailInfoExample);
        if (userDetailInfos.size() > 0) {
            throw new ValidateException("手机号码已被注册");
        }
    }
    
    private void beforeValidateAuth(CheckAuthRequest request) {
        if (request == null) {
            throw new ValidateException("请求对象为空");
        }
        if (StringUtils.isEmpty(request.getToken())) {
            throw new ValidateException("token信息为空");
        }
    }
    
    private void beforeValidate(UserLoginRequest request) {
        if (request == null) {
            throw new ValidateException("请求对象为空");
        }
        if (StringUtils.isEmpty(request.getUserName())) {
            throw new ValidateException("用户名为空");
        }
        if (StringUtils.isEmpty(request.getUserPassword())) {
            throw new ValidateException("密码为空");
        }
    }
}
