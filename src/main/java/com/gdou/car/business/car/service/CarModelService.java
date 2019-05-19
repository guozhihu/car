package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.carModel.CarModelCreateRequest;
import com.gdou.car.business.car.dal.dto.carModel.CarModelCreateResponse;
import com.gdou.car.business.car.dal.dto.carModel.CarModelQueryListResponse;
import com.gdou.car.business.car.dal.dto.carModel.CarModelQueryResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 3:29
 */
public interface CarModelService {
    
    CarModelCreateResponse createCarModel(CarModelCreateRequest request);
    
    CarModelQueryResponse queryById(String modelId);
    
    CarModelQueryListResponse queryAll();
}
