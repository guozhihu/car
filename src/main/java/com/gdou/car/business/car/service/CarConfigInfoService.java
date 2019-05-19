package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.carConfigInfo.CarConfigInfoCreateResponse;


/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:07
 */
public interface CarConfigInfoService {
    
    CarConfigInfoCreateResponse createCarConfig(CarInfoCreateRequest request);
}
