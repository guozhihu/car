package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.carConfigInfo.CarConfigInfoCreateResponse;
import com.gdou.car.business.car.dal.entitys.CarConfigInfo;
import com.gdou.car.business.car.dal.persistence.CarConfigInfoMapper;
import com.gdou.car.business.car.service.CarConfigInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:08
 */
@Service
public class CarConfigInfoServiceImpl implements CarConfigInfoService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    
    @Autowired
    private CarConfigInfoMapper carConfigInfoMapper;
    
    @Override
    public CarConfigInfoCreateResponse createCarConfig(CarInfoCreateRequest request) {
        Log.info("create car config request:" + request);
        
        CarConfigInfoCreateResponse response = new CarConfigInfoCreateResponse();
        try {
            CarConfigInfo carConfigInfo = new CarConfigInfo();
            BeanUtils.copyProperties(request, carConfigInfo);
            carConfigInfo.setCarId(request.getCarId());
            // 添加汽车配置信息
            carConfigInfoMapper.insertSelective(carConfigInfo);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("create car config occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("create car config response->" + response);
        }
        return response;
    }
}
