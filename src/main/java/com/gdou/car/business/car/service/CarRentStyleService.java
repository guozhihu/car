package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleCreateRequest;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleCreateResponse;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleQueryListResponse;
import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleQueryResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:43
 */
public interface CarRentStyleService {
    
    CarRentStyleCreateResponse createCarRentStyle(CarRentStyleCreateRequest request);
    
    CarRentStyleQueryResponse queryById(Integer styleId);
    
    CarRentStyleQueryListResponse queryAll();
}
