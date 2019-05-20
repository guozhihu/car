package com.gdou.car.business.car.dal.dto;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.valobj.CarConfigDetail;
import com.gdou.car.business.car.dal.valobj.CarInfoValobj;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 23:00
 */
public class CarInfoDetailResponse extends AbstractResponse {
    
    private CarInfoValobj carInfo;
    private CarConfigDetail carConfig;
    
    private static final long serialVersionUID = -4339966548381840119L;
    
    public CarInfoValobj getCarInfo() {
        return carInfo;
    }
    
    public void setCarInfo(CarInfoValobj carInfo) {
        this.carInfo = carInfo;
    }
    
    public CarConfigDetail getCarConfig() {
        return carConfig;
    }
    
    public void setCarConfig(CarConfigDetail carConfig) {
        this.carConfig = carConfig;
    }
}
