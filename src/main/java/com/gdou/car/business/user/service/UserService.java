package com.gdou.car.business.user.service;

import com.gdou.car.business.user.dal.dto.*;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/15 17:19
 */
public interface UserService {
    /**
     * 用户登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);
    
    
    /**
     * 校验过程
     * @param request
     * @return
     */
    CheckAuthResponse validToken(CheckAuthRequest request);
    
    
    /*
     * 注册
     */
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);
}
