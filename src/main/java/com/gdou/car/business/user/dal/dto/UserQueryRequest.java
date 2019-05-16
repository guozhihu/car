package com.gdou.car.business.user.dal.dto;

import com.gdou.car.api.abs.AbstractRequest;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:14
 */
public class UserQueryRequest extends AbstractRequest implements Serializable {
    private static final long serialVersionUID = 7306023298178530119L;
    
    private Integer uid;
    
    
    public Integer getUid() {
        return uid;
    }
    
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    
}
