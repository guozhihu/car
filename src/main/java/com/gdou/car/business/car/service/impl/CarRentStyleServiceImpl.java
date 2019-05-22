package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleCreateRequest;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleCreateResponse;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleQueryListResponse;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleQueryResponse;
import com.gdou.car.business.car.dal.entitys.CarRentStyle;
import com.gdou.car.business.car.dal.entitys.CarRentStyleExample;
import com.gdou.car.business.car.dal.persistence.CarRentStyleMapper;
import com.gdou.car.business.car.service.CarRentStyleService;
import com.gdou.car.common.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:43
 */
@Service
public class CarRentStyleServiceImpl implements CarRentStyleService {
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarRentStyleMapper carRentStyleMapper;
    
    /**
     * 处理添加汽车租用方案的请求
     *
     * @param request
     * @return
     */
    @Override
    public CarRentStyleCreateResponse createCarRentStyle(CarRentStyleCreateRequest request) {
        Log.info("car rent style create request:" + request);
        
        CarRentStyleCreateResponse response = new CarRentStyleCreateResponse();
        try {
            CarRentStyle carRentStyle = new CarRentStyle();
            String styleId = RandomUtils.generateNum(8);
            carRentStyle.setStyleId(Integer.parseInt(styleId));
            carRentStyle.setStyleName(request.getStyleName());
            // 添加汽车租用方案
            carRentStyleMapper.insertSelective(carRentStyle);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setCode(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car rent style create occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car rent style create response->" + response);
        }
        return response;
    }
    
    @Override
    public CarRentStyleQueryResponse queryById(Integer styleId) {
        Log.info("car rent style query request:" + styleId);
        
        CarRentStyleQueryResponse response = new CarRentStyleQueryResponse();
        try {
            CarRentStyle carRentStyle = carRentStyleMapper.selectByPrimaryKey(styleId);
            if (null == carRentStyle) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                response.setMsg(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            } else {
                response.setStyleName(carRentStyle.getStyleName());
                response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
                response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
            }
        } catch (Exception e) {
            Log.error("car rent style query occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car rent style query response->" + response);
        }
        return response;
    }
    
    @Override
    public CarRentStyleQueryListResponse queryAll() {
        Log.info("car rent style query all request:");
        
        CarRentStyleQueryListResponse response = new CarRentStyleQueryListResponse();
        try {
            CarRentStyleExample example = new CarRentStyleExample();
            CarRentStyleExample.Criteria criteria = example.createCriteria();
            criteria.andStyleIdIsNotNull();
            List<CarRentStyle> carRentStyles = carRentStyleMapper.selectByExample(example);
            if (CollectionUtils.isEmpty(carRentStyles)) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                response.setMsg(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            } else {
                response.setCarRentStyles(carRentStyles);
                response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
                response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
            }
        } catch (Exception e) {
            Log.error("car rent style query all occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car rent style query all response->" + response);
        }
        return response;
    }
}
