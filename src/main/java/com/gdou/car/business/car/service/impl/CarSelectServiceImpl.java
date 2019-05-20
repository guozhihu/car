package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.CarInfoDetailResponse;
import com.gdou.car.business.car.dal.dto.CarSelectResponse;
import com.gdou.car.business.car.dal.entitys.*;
import com.gdou.car.business.car.dal.persistence.*;
import com.gdou.car.business.car.dal.valobj.CarConfigDetail;
import com.gdou.car.business.car.dal.valobj.CarInfo2Prices;
import com.gdou.car.business.car.dal.valobj.CarInfoValobj;
import com.gdou.car.business.car.dal.valobj.CarPrices;
import com.gdou.car.business.car.service.CarSelectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 10:44
 */
@Service
public class CarSelectServiceImpl implements CarSelectService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarReleaseMapper carReleaseMapper;
    
    @Autowired
    private CarInfoMapper carInfoMapper;
    
    @Autowired
    private CarPriceMapper carPriceMapper;
    
    @Autowired
    private CarBrandMapper carBrandMapper;
    
    @Autowired
    private CarModelMapper carModelMapper;
    
    @Autowired
    private CarConfigInfoMapper carConfigInfoMapper;
    
    @Override
    public CarSelectResponse select(String locationInfoId, String brandId, String modelId) {
        Log.info("car select request: " + "locationInfoId=" + locationInfoId + ";brandId=" + brandId + ";modelId=" + modelId);
        
        CarSelectResponse response = new CarSelectResponse();
        try {
            // 首先根据选中的地理位置筛选出该地的可租用车辆
            CarReleaseExample carReleaseExample = new CarReleaseExample();
            CarReleaseExample.Criteria criteria = carReleaseExample.createCriteria();
            criteria.andLocationInfoIdEqualTo(locationInfoId);
            criteria.andAvailableCountGreaterThan(new Integer(0));
            List<CarRelease> carReleases = carReleaseMapper.selectByExample(carReleaseExample);
            if (CollectionUtils.isEmpty(carReleases)) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                return response;
            }
            
            // 封装汽车id
            List<String> carIds = new ArrayList<String>();
            for (CarRelease carRelease : carReleases) {
                carIds.add(carRelease.getCarId());
            }
    
            // 根据汽车id编号集合查找汽车信息
            CarInfoExample carInfoExample = new CarInfoExample();
            CarInfoExample.Criteria criteria1 = carInfoExample.createCriteria();
            criteria1.andCarIdIn(carIds);
            // 根据汽车品牌查询汽车
            if (!StringUtils.isEmpty(brandId)) {
                System.err.println(brandId);
                criteria1.andBranIdEqualTo(brandId);
            }
            // 根据汽车车型查询汽车
            if (!StringUtils.isEmpty(modelId)) {
                System.err.println(modelId);
                criteria1.andModelIdEqualTo(modelId);
            }
            
            // 封装查询到的汽车信息集合
            List<CarInfo> carInfos = carInfoMapper.selectByExample(carInfoExample);
            if (CollectionUtils.isEmpty(carInfos)) {
                response.setCode(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                return response;
            }
    
            /**
             *  封装汽车信息及每种车的租车方案价格
             */
            List<CarInfo2Prices> carInfo2Prices = new ArrayList<CarInfo2Prices>();
            for (CarInfo carInfo : carInfos) {
                CarInfoValobj valobj = carInfo2CarInfoValobj(carInfo);
                
                CarPriceExample carPriceExample = new CarPriceExample();
                CarPriceExample.Criteria criteria2 = carPriceExample.createCriteria();
                criteria2.andCarIdEqualTo(carInfo.getCarId());
                List<CarPrice> carPriceList = carPriceMapper.selectByExample(carPriceExample);
                
                List<CarPrices> carPricesList = new ArrayList<CarPrices>();
                for(CarPrice c : carPriceList) {
                    CarPrices cs = new CarPrices();
                    BeanUtils.copyProperties(c, cs);
                    carPricesList.add(cs);
                }
                
                CarInfo2Prices carInfo2Price = new CarInfo2Prices();
                carInfo2Price.setCarInfoValobj(valobj);
                carInfo2Price.setCarPrices(carPricesList);
                carInfo2Prices.add(carInfo2Price);
            }
            response.setCarInfo2Prices(carInfo2Prices);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car select occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car select response->" + response);
        }
        return response;
    }
    
    @Override
    public CarInfoDetailResponse carDetail(String carId) {
        Log.info("car detail query request:" + carId);
    
        CarInfoDetailResponse response = new CarInfoDetailResponse();
        try {
            CarInfo c = carInfoMapper.selectByPrimaryKey(carId);
            CarInfoValobj carInfo = carInfo2CarInfoValobj(c);
            CarConfigInfo carConfigInfo = carConfigInfoMapper.selectByPrimaryKey(carId);
            CarConfigDetail carConfig = new CarConfigDetail();
            BeanUtils.copyProperties(carConfigInfo, carConfig);
            response.setCarInfo(carInfo);
            response.setCarConfig(carConfig);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car detail query occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car detail query response->" + response);
        }
        return response;
    }
    
    /**
     * 将实体对象CarInfo转化为页面信息CarInfoValobj
     * @param carInfo
     * @return
     */
    private CarInfoValobj carInfo2CarInfoValobj(CarInfo carInfo) {
        CarInfoValobj valobj = new CarInfoValobj();
        BeanUtils.copyProperties(carInfo, valobj);
        CarBrand carBrand = carBrandMapper.selectByPrimaryKey(carInfo.getBranId());
        if (null != carBrand) {
            System.err.println(carBrand.getBrandName());
            valobj.setBrandName(carBrand.getBrandName());
        }
        CarModel carModel = carModelMapper.selectByPrimaryKey(carInfo.getModelId());
        if (null != carModel) {
            valobj.setModelName(carModel.getModelName());
        }
        return valobj;
    }
    
}
