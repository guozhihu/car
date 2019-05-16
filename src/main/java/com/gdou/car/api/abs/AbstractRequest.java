package com.gdou.car.api.abs;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:05
 */
public abstract class AbstractRequest implements Serializable {
    
    private static final long serialVersionUID = 1717442845820713651L;
    
    @Override
    public String toString() {
        return "AbstractRequest{}";
    }
}
