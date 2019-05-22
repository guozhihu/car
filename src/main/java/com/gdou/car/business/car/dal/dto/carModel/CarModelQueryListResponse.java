package com.gdou.car.business.car.dal.dto.carModel;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.entitys.CarModel;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 3:33
 */
public class CarModelQueryListResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4338120778381840119L;
    
    private List<CarModel> carModels;
    
    public List<CarModel> getCarModels() {
        return carModels;
    }
    
    public void setCarModels(List<CarModel> carModels) {
        this.carModels = carModels;
    }
}
