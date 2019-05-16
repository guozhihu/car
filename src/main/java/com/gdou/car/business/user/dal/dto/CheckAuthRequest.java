package com.gdou.car.business.user.dal.dto;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:12
 */
public class CheckAuthRequest implements Serializable {
    
    private String token;
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    @Override
    public String toString() {
        return "CheckAuthRequest{" +
            "token='" + token + '\'' +
            '}';
    }
}
