package com.gdou.car.business.user.constants;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:07
 */
public enum UserResponseCodeEnum {
    USERORPASSWORD_ERRROR("001001", "用户名或密码不存在"),
    SUCCESS("000000", "成功"),
    SYS_PARAM_NOT_RIGHT("001002", "请求参数错误"),
    TOKEN_EXPIRE("001003", "token过期"),
    SIGNATURE_ERROR("001004", "签名验证失败"),
    QUERY_DATA_NOT_EXIST("001005", "请求数据不存在"),
    SYSTEM_BUSY("001099", "系统繁忙，请稍候重试");
    
    private final String code;
    private final String msg;
    
    UserResponseCodeEnum(String code, String msg) {
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
