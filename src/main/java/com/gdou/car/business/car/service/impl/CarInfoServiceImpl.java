package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.CarInfoCreateResponse;
import com.gdou.car.business.car.dal.dto.CarInfoQueryResponse;
import com.gdou.car.business.car.dal.dto.carInfo.CarInfoQueryListResponse;
import com.gdou.car.business.car.dal.entitys.CarBrand;
import com.gdou.car.business.car.dal.entitys.CarInfo;
import com.gdou.car.business.car.dal.entitys.CarInfoExample;
import com.gdou.car.business.car.dal.entitys.CarModel;
import com.gdou.car.business.car.dal.persistence.CarBrandMapper;
import com.gdou.car.business.car.dal.persistence.CarInfoMapper;
import com.gdou.car.business.car.dal.persistence.CarModelMapper;
import com.gdou.car.business.car.dal.valobj.CarInfoValobj;
import com.gdou.car.business.car.service.CarInfoService;
import com.gdou.car.common.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/17 23:37
 */
@Service
public class CarInfoServiceImpl implements CarInfoService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarInfoMapper carInfoMapper;
    
    @Autowired
    private CarBrandMapper carBrandMapper;
    
    @Autowired
    private CarModelMapper carModelMapper;
    
    @Override
    public CarInfoCreateResponse createCar(CarInfoCreateRequest request) {
        Log.info("create car request:" + request);
        CarInfoCreateResponse response = new CarInfoCreateResponse();
        
        try {
            CarInfo carInfo = new CarInfo();
            String carId = RandomUtils.generateString(32);
            BeanUtils.copyProperties(request, carInfo);
            carInfo.setCarId(carId);
            carInfoMapper.insertSelective(carInfo);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
            response.setCarId(carId);
        } catch (Exception e) {
            Log.error("create car occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("create car response->" + response);
        }
        return response;
    }
    
    @Override
    public CarInfoQueryResponse queryCarById(String carId) {
        Log.info("query car request:" + carId);
        CarInfoQueryResponse response = new CarInfoQueryResponse();
        try {
            // 获取汽车基本信息
            CarInfo carInfo = carInfoMapper.selectByPrimaryKey(carId);
            // 请求的数据不存在
            if (null == carInfo) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                response.setMsg(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            } else { // 封装请求数据
                BeanUtils.copyProperties(carInfo, response);
                response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
                response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
            }
        } catch (Exception e) {
            Log.error("query car occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("query car response->" + response);
        }
        return response;
    }
    
    @Override
    public CarInfoQueryListResponse queryCarInfoAll() {
        Log.info("query carInfo all request:");
    
        CarInfoQueryListResponse response = new CarInfoQueryListResponse();
        try {
            CarInfoExample example = new CarInfoExample();
            CarInfoExample.Criteria criteria = example.createCriteria();
            criteria.andCarIdIsNotNull();
            List<CarInfo> carInfos = carInfoMapper.selectByExample(example);
    
            List<CarInfoValobj> carInfoValobjs = new ArrayList<CarInfoValobj>();
            for (CarInfo carInfo : carInfos) {
                CarInfoValobj valobj = new CarInfoValobj();
                BeanUtils.copyProperties(carInfo, valobj);
                CarBrand carBrand = carBrandMapper.selectByPrimaryKey(carInfo.getBranId());
                if (null != carBrand) {
                    valobj.setBrandName(carBrand.getBrandName());
                }
                CarModel carModel = carModelMapper.selectByPrimaryKey(carInfo.getModelId());
                if (null != carModel) {
                    valobj.setModelName(carModel.getModelName());
                }
                carInfoValobjs.add(valobj);
            }
            response.setCarInfoValobjs(carInfoValobjs);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("query carInfo all occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("query carInfo all response->" + response);
        }
        return response;
    }
}
/*
Log.info(" request:" + );
try {
    
    } catch (Exception e) {
        Log.error(" occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
    } finally {
        Log.info(" response->" + response);
    }
    return response;
    */
