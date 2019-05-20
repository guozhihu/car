package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.carRelease.CarReleaseRequest;
import com.gdou.car.business.car.dal.dto.carRelease.CarReleaseResponse;
import com.gdou.car.business.car.dal.entitys.CarRelease;
import com.gdou.car.business.car.dal.persistence.CarReleaseMapper;
import com.gdou.car.business.car.service.CarReleaseService;
import com.gdou.car.common.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:11
 */
@Service
public class CarReleaseServiceImpl implements CarReleaseService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarReleaseMapper carReleaseMapper;
    
    @Override
    public CarReleaseResponse release(CarReleaseRequest request) {
        Log.info("car release request:" + request);
    
        CarReleaseResponse response = new CarReleaseResponse();
        try {
            CarRelease carRelease = new CarRelease();
            BeanUtils.copyProperties(request, carRelease);
            carRelease.setReleaseId(RandomUtils.generateString(32));
            // 发布车辆
            carReleaseMapper.insert(carRelease);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car release occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car release response->" + response);
        }
        return response;
    }
}
