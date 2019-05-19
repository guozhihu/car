package com.gdou.car.business.car.dal.dto.carBrand;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.entitys.CarBrand;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 2:50
 */
public class CarBrandQueryListResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4338800778381840119L;
    
    private List<CarBrand> carBrands;
    
    public List<CarBrand> getCarBrands() {
        return carBrands;
    }
    
    public void setCarBrands(List<CarBrand> carBrands) {
        this.carBrands = carBrands;
    }
}
