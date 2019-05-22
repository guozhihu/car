package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.carBrand.CarBrandCreateRequest;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandCreateResponse;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandQueryListResponse;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandQueryResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 2:45
 */
public interface CarBrandService {
    
    CarBrandCreateResponse createCarBrand(CarBrandCreateRequest request);
    
    CarBrandQueryResponse queryById(String brandId);
    
    CarBrandQueryListResponse queryAll();
}
