package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.carModel.CarModelCreateRequest;
import com.gdou.car.business.car.dal.dto.carModel.CarModelCreateResponse;
import com.gdou.car.business.car.dal.dto.carModel.CarModelQueryListResponse;
import com.gdou.car.business.car.dal.dto.carModel.CarModelQueryResponse;
import com.gdou.car.business.car.dal.entitys.CarModel;
import com.gdou.car.business.car.dal.entitys.CarModelExample;
import com.gdou.car.business.car.dal.persistence.CarModelMapper;
import com.gdou.car.business.car.service.CarModelService;
import com.gdou.car.common.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 3:35
 */
@Service
public class CarModelServiceImpl implements CarModelService {
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarModelMapper carModelMapper;
    
    @Override
    public CarModelCreateResponse createCarModel(CarModelCreateRequest request) {
        Log.info("car model create request:" + request);
    
        CarModelCreateResponse response = new CarModelCreateResponse();
        try {
            CarModel carModel = new CarModel();
            carModel.setModelId(RandomUtils.generateString(4));
            carModel.setModelName(request.getModelName());
            carModelMapper.insertSelective(carModel);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car model create occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car model create response->" + response);
        }
        return response;
    }
    
    @Override
    public CarModelQueryResponse queryById(String modelId) {
        Log.info("car model query request:" + modelId);
    
        CarModelQueryResponse response = new CarModelQueryResponse();
        try {
            CarModel carModel = new CarModel();
            carModel = carModelMapper.selectByPrimaryKey(modelId);
            response.setModelName(carModel.getModelName());
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car model query occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car model query response->" + response);
        }
        return response;
    }
    
    @Override
    public CarModelQueryListResponse queryAll() {
        Log.info("car model query all request");
    
        CarModelQueryListResponse response = new CarModelQueryListResponse();
        try {
            CarModelExample example = new CarModelExample();
            CarModelExample.Criteria criteria = example.createCriteria();
            criteria.andModelIdIsNotNull();
            List<CarModel> carModels = carModelMapper.selectByExample(example);
            // 数据不存在
            if (CollectionUtils.isEmpty(carModels)) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                response.setMsg(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            } else {
                response.setCarModels(carModels);
                response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
                response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
            }
        } catch (Exception e) {
            Log.error("car model query all occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car model query all response->" + response);
        }
        return response;
    }
}
