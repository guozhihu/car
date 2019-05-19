package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandCreateRequest;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandCreateResponse;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandQueryListResponse;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandQueryResponse;
import com.gdou.car.business.car.dal.entitys.CarBrand;
import com.gdou.car.business.car.dal.entitys.CarBrandExample;
import com.gdou.car.business.car.dal.persistence.CarBrandMapper;
import com.gdou.car.business.car.service.CarBrandService;
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
 * Date: Create in 2019/5/18 2:46
 */
@Service
public class CarBrandServiceImpl implements CarBrandService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarBrandMapper carBrandMapper;
    
    
    @Override
    public CarBrandCreateResponse createCarBrand(CarBrandCreateRequest request) {
        Log.info("car brand create request:" + request);
    
        CarBrandCreateResponse response = new CarBrandCreateResponse();
        try {
            CarBrand carBrand = new CarBrand();
            carBrand.setBrandId(RandomUtils.generateString(4));
            carBrand.setBrandName(request.getBrandName());
            // 添加汽车品牌
            carBrandMapper.insertSelective(carBrand);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car brand create occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car brand create response->" + response);
        }
        return response;
    }
    
    @Override
    public CarBrandQueryResponse queryById(String brandId) {
        Log.info("query car brand request:" + brandId);
        
        CarBrandQueryResponse response = new CarBrandQueryResponse();
        
        try {
            // 查询汽车品牌
            CarBrand carBrand = carBrandMapper.selectByPrimaryKey(brandId);
            response.setBrandName(carBrand.getBrandName());
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setCode(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("query car brand occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("query car brand response->" + response);
        }
        return response;
    }
    
    @Override
    public CarBrandQueryListResponse queryAll() {
        Log.info("car brand query all request");
        
        CarBrandQueryListResponse response = new CarBrandQueryListResponse();
        try {
            CarBrandExample example = new CarBrandExample();
            CarBrandExample.Criteria criteria = example.createCriteria();
            criteria.andBrandIdIsNotNull();
            List<CarBrand> carBrands = carBrandMapper.selectByExample(example);
            // 数据不存在
            if (CollectionUtils.isEmpty(carBrands)) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                response.setMsg(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            } else {
                response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
                response.setCode(CarResponseCodeEnum.SUCCESS.getMsg());
                response.setCarBrands(carBrands);
            }
        } catch (Exception e) {
            Log.error(" occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info(" response->" + response);
        }
        return response;
    }
}
