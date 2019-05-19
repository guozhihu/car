package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.carRelease.CarReleaseRequest;
import com.gdou.car.business.car.dal.dto.carRelease.CarReleaseResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:11
 */
public interface CarReleaseService {
    
    CarReleaseResponse release(CarReleaseRequest request);
}
