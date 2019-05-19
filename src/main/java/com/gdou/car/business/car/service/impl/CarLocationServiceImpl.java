package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateRequest;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateResponse;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationQueryListResponse;
import com.gdou.car.business.car.dal.entitys.CarLocation;
import com.gdou.car.business.car.dal.entitys.CarLocationExample;
import com.gdou.car.business.car.dal.persistence.CarLocationMapper;
import com.gdou.car.business.car.service.CarLocationService;
import com.gdou.car.common.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:36
 */
@Service
public class CarLocationServiceImpl implements CarLocationService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarLocationMapper carLocationMapper;
    
    @Override
    public CarLocationCreateResponse createCarLocation(CarLocationCreateRequest request) {
        Log.info("car location create request:" + request);
    
        CarLocationCreateResponse response = new CarLocationCreateResponse();
        try {
            CarLocation carLocation = new CarLocation();
            BeanUtils.copyProperties(request, carLocation);
            carLocation.setLocationInfoId(RandomUtils.generateString(12));
            carLocationMapper.insert(carLocation);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car location create occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car location create response->" + response);
        }
        return response;
    }
    
    @Override
    public CarLocationQueryListResponse queryAll() {
        Log.info("car location query all request");
    
        CarLocationQueryListResponse response = new CarLocationQueryListResponse();
        try {
            CarLocationExample example = new CarLocationExample();
            CarLocationExample.Criteria criteria = example.createCriteria();
            criteria.andLocationInfoIdIsNotNull();
            List<CarLocation> carLocations = carLocationMapper.selectByExample(example);
            response.setCarLocations(carLocations);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car location query all occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car location query all response->" + response);
        }
        return response;
    }
}
