package com.gdou.car.business.user.dal.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:08
 */
public class UserLoginResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4339900472381840119L;
    
    private Long userId;
    
    private String userName;
    
    @JsonIgnore
    private String token;
    
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getToken() {
        return token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    @Override
    public String toString() {
        return "UserLoginResponse{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", token='" + token + '\'' +
            "} " + super.toString();
    }
}
