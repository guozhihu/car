package com.gdou.car.business.user.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:12
 */
public class UserRegisterResponse extends AbstractResponse implements Serializable {
    
    private static final long serialVersionUID = -7690077437344492561L;
    
    private Long userId;
    
    private String userName;
    
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
}
