package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateRequest;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateResponse;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationQueryListResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:36
 */
public interface CarLocationService {
    
    CarLocationCreateResponse createCarLocation(CarLocationCreateRequest request);
    
    CarLocationQueryListResponse queryAll();
}
