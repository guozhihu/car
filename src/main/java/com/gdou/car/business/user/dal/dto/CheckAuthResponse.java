package com.gdou.car.business.user.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:11
 */
public class CheckAuthResponse extends AbstractResponse {
    
    private String uid;
    
    public String getUid() {
        return uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    @Override
    public String toString() {
        return "CheckAuthResponse{" +
            "uid='" + uid + '\'' +
            "} " + super.toString();
    }
}
