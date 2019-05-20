package com.gdou.car.business.order.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.order.dal.valobj.CarRentObj;

/**
 * Author: zhihu
 * Description: 租车请求响应
 * Date: Create in 2019/5/20 8:55
 */
public class CarRentResponse extends AbstractResponse {
    
    private CarRentObj carRent;
    
    private static final long serialVersionUID = -4339900888381840119L;
    
    public CarRentObj getCarRent() {
        return carRent;
    }
    
    public void setCarRent(CarRentObj carRent) {
        this.carRent = carRent;
    }
}
