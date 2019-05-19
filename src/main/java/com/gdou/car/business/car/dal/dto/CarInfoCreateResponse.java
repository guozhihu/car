package com.gdou.car.business.car.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 0:52
 */
public class CarInfoCreateResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4339900888381840119L;
    
    private String carId;
    
    public String getCarId() {
        return carId;
    }
    
    public void setCarId(String carId) {
        this.carId = carId;
    }
}
