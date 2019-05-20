package com.gdou.car.business.order.constants;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/20 8:40
 */
public enum OrderResponseCodeEnum {
    
    SUCCESS("000000", "成功"),
    SYS_PARAM_NOT_RIGHT("001002", "请求参数错误"),
    QUERY_DATA_NOT_EXIST("001005", "请求数据不存在"),
    SYSTEM_BUSY("001099", "系统繁忙，请稍候重试");
    
    private final String code;
    private final String msg;
    
    OrderResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getMsg() {
        return msg;
    }
}
