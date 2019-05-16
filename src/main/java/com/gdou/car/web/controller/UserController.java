package com.gdou.car.web.controller;

import com.gdou.car.business.user.dal.dto.UserLoginRequest;
import com.gdou.car.business.user.dal.dto.UserLoginResponse;
import com.gdou.car.business.user.dal.dto.UserRegisterRequest;
import com.gdou.car.business.user.dal.dto.UserRegisterResponse;
import com.gdou.car.business.user.service.UserService;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.web.controller.support.ResponseData;
import com.gdou.car.web.controller.support.ResponseEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/15 17:11
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController{
    
    @Autowired
    UserService userService;
    
    @Anoymous
    @PostMapping("/login")
    public ResponseData doLogin(@RequestBody UserLoginRequest request,
                                HttpServletResponse response){
//        System.err.println(username + "---" + password);
        ResponseData data=new ResponseData();
        UserLoginResponse userLoginResponse=userService.login(request);
        response.addHeader("Set-Cookie",
            "access_token="+userLoginResponse.getToken()+";Path=/;HttpOnly");
        
        data.setMessage(userLoginResponse.getMsg());
        data.setCode(userLoginResponse.getCode());
        data.setData(userLoginResponse);
        return data;
    }
    
    @PostMapping("/register")
    @Anoymous
    public @ResponseBody
    ResponseData register(@RequestBody UserRegisterRequest request){
        ResponseData data=new ResponseData();
        try {
            UserRegisterResponse response = userService.register(request);
            data.setMessage(response.getMsg());
            data.setCode(response.getCode());
            data.setData(response);
        }catch(Exception e) {
            data.setMessage(ResponseEnum.FAILED.getMsg());
            data.setCode(ResponseEnum.FAILED.getCode());
        }
        return data;
    }
    
}
