package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.carPrice.CarPricesCreateResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 7:45
 */
public interface CarPriceService {
    
    CarPricesCreateResponse createCarPrices(CarInfoCreateRequest request);
    
}
