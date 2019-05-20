package com.gdou.car.business.order.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.order.dal.valobj.CarRentObj;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/20 20:55
 */
public class CarRent2UserIdResponse  extends AbstractResponse {
    
    private List<CarRentObj> carRents;
    
    private static final long serialVersionUID = -4339900888381840119L;
    
    public List<CarRentObj> getCarRents() {
        return carRents;
    }
    
    public void setCarRents(List<CarRentObj> carRents) {
        this.carRents = carRents;
    }
}
