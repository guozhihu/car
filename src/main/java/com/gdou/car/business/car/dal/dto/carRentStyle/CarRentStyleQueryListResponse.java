package com.gdou.car.business.car.dal.dto.carRentStyle;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.entitys.CarRentStyle;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:47
 */
public class CarRentStyleQueryListResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4338800778381848763L;
    
    private List<CarRentStyle> carRentStyles;
    
    public List<CarRentStyle> getCarRentStyles() {
        return carRentStyles;
    }
    
    public void setCarRentStyles(List<CarRentStyle> carRentStyles) {
        this.carRentStyles = carRentStyles;
    }
}
