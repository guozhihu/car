package com.gdou.car.config;

import com.gdou.car.web.intercept.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/16 0:49
 */
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    
    @Autowired
    private LoginInterceptor loginInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
        /*.excludePathPatterns("/login", "/register")*/
        ;
    }
}
