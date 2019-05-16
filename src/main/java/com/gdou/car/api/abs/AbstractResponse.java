package com.gdou.car.api.abs;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:05
 */
public abstract class AbstractResponse implements Serializable {
    
    private static final long serialVersionUID = 7505997295595095971L;
    @JsonIgnore
    private String code;
    @JsonIgnore
    private String msg;
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getMsg() {
        return msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
