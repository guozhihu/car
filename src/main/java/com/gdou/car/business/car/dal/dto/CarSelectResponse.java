package com.gdou.car.business.car.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.valobj.CarInfo2Prices;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 10:47
 */
public class CarSelectResponse extends AbstractResponse {
    
    private List<CarInfo2Prices> carInfo2Prices;
    
    private static final long serialVersionUID = -4339900888381840119L;
    
    public List<CarInfo2Prices> getCarInfo2Prices() {
        return carInfo2Prices;
    }
    
    public void setCarInfo2Prices(List<CarInfo2Prices> carInfo2Prices) {
        this.carInfo2Prices = carInfo2Prices;
    }
}
