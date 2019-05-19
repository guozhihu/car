package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.carPrice.CarPricesCreateResponse;
import com.gdou.car.business.car.dal.entitys.CarPrice;
import com.gdou.car.business.car.dal.persistence.CarPriceMapper;
import com.gdou.car.business.car.dal.valobj.CarPrices;
import com.gdou.car.business.car.service.CarPriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 7:46
 */
@Service
public class CarPriceServiceImpl implements CarPriceService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarPriceMapper carPriceMapper;
    
    @Override
    public CarPricesCreateResponse createCarPrices(CarInfoCreateRequest request) {
        Log.info("car price bulk create request:" + request);
    
        CarPricesCreateResponse response = new CarPricesCreateResponse();
        try {
            List<CarPrices> carPrices = request.getCarPrices();
            CarPrice price = new CarPrice();
            for (CarPrices carPrice : carPrices) {
                price.setCarId(request.getCarId());
                price.setStyleId(carPrice.getStyleId());
                price.setRentPrice(carPrice.getRentPrice());
                carPriceMapper.insert(price);
            }
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car price bulk create occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car price bulk create response->" + response);
        }
        return response;
    }
}
