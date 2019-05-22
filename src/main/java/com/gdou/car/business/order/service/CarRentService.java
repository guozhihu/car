package com.gdou.car.business.order.service;

import com.gdou.car.business.order.dal.dto.CarRent2UserIdResponse;
import com.gdou.car.business.order.dal.dto.CarRentRequest;
import com.gdou.car.business.order.dal.dto.CarRentResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/16 10:13
 */
public interface CarRentService {
    
    // 下单
    CarRentResponse reservation(CarRentRequest rentRequest);
    
    // 根据用户编号获取所有订单
    CarRent2UserIdResponse getByUserId(Long userId);
    
    // 根据订单编号获取订单
    CarRentResponse getByListId(String listId);
}
