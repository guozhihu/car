package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.CarInfoDetailResponse;
import com.gdou.car.business.car.dal.dto.CarSelectResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 10:44
 */
public interface CarSelectService {

    CarSelectResponse select(String locationInfoId, String brandId, String modelId);

    CarInfoDetailResponse carDetail(String carId);
}
