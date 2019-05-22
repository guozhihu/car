package com.gdou.car.business.car.dal.dto.carModel;

import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 3:31
 */
public class CarModelQueryResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4338886888381840119L;
    
    private String modelName;
    
    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
