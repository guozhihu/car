package com.gdou.car.common.base;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 22:53
 */
public class BaseController {
    
    static ThreadLocal<String> uidThreadLocal = new ThreadLocal<>();
    
    public void setUid(String uid) {
        uidThreadLocal.set(uid);
    }
    
    public String getUid() {
        return uidThreadLocal.get();
    }
}
