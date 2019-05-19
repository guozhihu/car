package com.gdou.car.business.car.dal.dto.carModel;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 3:26
 */
public class CarModelCreateRequest implements Serializable {
    
    private static final long serialVersionUID = 686223878602508882L;
    
    private String modelName;
    
    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
