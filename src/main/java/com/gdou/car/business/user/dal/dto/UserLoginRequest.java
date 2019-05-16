package com.gdou.car.business.user.dal.dto;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:09
 */
public class UserLoginRequest implements Serializable {
    
    private static final long serialVersionUID = 686223598602505582L;
    
    private String userName;
    
    private String userPassword;
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserPassword() {
        return userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
