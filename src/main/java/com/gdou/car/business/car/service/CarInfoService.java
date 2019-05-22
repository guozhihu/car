package com.gdou.car.business.car.service;

import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.CarInfoCreateResponse;
import com.gdou.car.business.car.dal.dto.CarInfoQueryResponse;
import com.gdou.car.business.car.dal.dto.carInfo.CarInfoQueryListResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/17 23:35
 */
public interface CarInfoService {
    
    // 添加可租用车辆到汽车租赁系统
    public CarInfoCreateResponse createCar(CarInfoCreateRequest request);
    
    // 根据汽车id查询汽车基本信息
    public CarInfoQueryResponse queryCarById(String carId);
    
    // 查询所有汽车信息
    public CarInfoQueryListResponse queryCarInfoAll();
    
}
