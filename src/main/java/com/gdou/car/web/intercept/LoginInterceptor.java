package com.gdou.car.web.intercept;

import com.gdou.car.business.user.dal.dto.CheckAuthRequest;
import com.gdou.car.business.user.dal.dto.CheckAuthResponse;
import com.gdou.car.business.user.service.UserService;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.common.constants.WebConstant;
import com.gdou.car.common.utils.CookieUtil;
import com.gdou.car.common.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/16 0:52
 */
@Component
public class LoginInterceptor /*implements HandlerInterceptor*/ extends HandlerInterceptorAdapter {
    
    private final String ACCESS_TOKEN="access_token";
    
    @Autowired
    UserService userService;
    
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
    
        System.err.println("登录拦截器");
        
        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        
        HandlerMethod handlerMethod=(HandlerMethod)handler;
        Object bean=handlerMethod.getBean();
        
        if(isAnoymous(handlerMethod)){
            return true;
        }
        if(!(bean instanceof BaseController)){
            throw new RuntimeException("must extend basecontroller");
        }
        String token= CookieUtil.getCookieValue(request,ACCESS_TOKEN);
        boolean isAjax=CookieUtil.isAjax(request);
        if(StringUtils.isEmpty(token)){
            if(isAjax){ // 判断是否是ajax请求
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write("{\"code\":\"-1\",\"msg\":\"error\"}");
                return false;
            }
            response.sendRedirect(WebConstant.SSO_ACCESS_URL);
            return false;
        }
        CheckAuthRequest checkAuthRequest=new CheckAuthRequest();
        checkAuthRequest.setToken(token);
        CheckAuthResponse checkAuthResponse= userService.validToken(checkAuthRequest);
        if("000000".equals(checkAuthResponse.getCode())){
            BaseController baseController=(BaseController)bean;
            baseController.setUid(checkAuthResponse.getUid());
            return super.preHandle(request, response, handler);
        }
        if(isAjax){
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("{\"code\":\""+checkAuthResponse.getCode()+"\"" +
                ",\"msg\":\""+checkAuthResponse.getMsg()+"\"}");
            return false;
        }
        response.sendRedirect(WebConstant.SSO_ACCESS_URL);
        return false;
    }
    
    private boolean isAnoymous(HandlerMethod handlerMethod){
        Object bean=handlerMethod.getBean();
        Class clazz=bean.getClass();
        if(clazz.getAnnotation(Anoymous.class)!=null){
            return true;
        }
        Method method=handlerMethod.getMethod();
        return method.getAnnotation(Anoymous.class)!=null;
    }
}
