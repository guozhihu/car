package com.gdou.car.business.car.dal.dto.carLocation;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.entitys.CarLocation;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:40
 */
public class CarLocationQueryListResponse extends AbstractResponse {
    
    private static final long serialVersionUID = 686223598602508882L;
    
    List<CarLocation> carLocations;
    
    public List<CarLocation> getCarLocations() {
        return carLocations;
    }
    
    public void setCarLocations(List<CarLocation> carLocations) {
        this.carLocations = carLocations;
    }
}
