package com.gdou.car.business.car.service.impl;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationAssociationResponse;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateRequest;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateResponse;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationQueryListResponse;
import com.gdou.car.business.car.dal.entitys.CarLocation;
import com.gdou.car.business.car.dal.entitys.CarLocationExample;
import com.gdou.car.business.car.dal.persistence.CarLocationMapper;
import com.gdou.car.business.car.dal.valobj.CarLocationCity2AddressesValobj;
import com.gdou.car.business.car.dal.valobj.CarLocationId2AddressValobj;
import com.gdou.car.business.car.service.CarLocationService;
import com.gdou.car.common.utils.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
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
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car location query all response->" + response);
        }
        return response;
    }
    
    @Override
    public CarLocationAssociationResponse queryCity2Addresses() {
        Log.info("query associations request:");
    
        CarLocationAssociationResponse response = new CarLocationAssociationResponse();
        try {
            // 查询所有地址信息
            List<CarLocation> carLocations = queryAll().getCarLocations();
    
            /**
             * 拆解并封装
             */
            List<CarLocationCity2AddressesValobj> city2AddressesValobjs = new ArrayList<CarLocationCity2AddressesValobj>();
    
            Map<String, List<CarLocationId2AddressValobj>> maps = new HashMap<String, List<CarLocationId2AddressValobj>>();
            for (CarLocation carLocation : carLocations) {
                // 关联地理位置id和地理位置
                CarLocationId2AddressValobj id2Address = new CarLocationId2AddressValobj();
                id2Address.setLocationInfoId(carLocation.getLocationInfoId());
                id2Address.setAdress(carLocation.getAdress());
                
                // 取得城市名称
                String city = carLocation.getCity();
                if (maps.containsKey(city)) {
                    List<CarLocationId2AddressValobj> carLocationId2AddressValobjs = maps.get(city);
                    carLocationId2AddressValobjs.add(id2Address);
                    maps.put(city, carLocationId2AddressValobjs);
                } else {
                    List<CarLocationId2AddressValobj> id2Addresses = new ArrayList<CarLocationId2AddressValobj>();
                    id2Addresses.add(id2Address);
                    maps.put(city, id2Addresses);
                }
            }
            
            for (Map.Entry<String, List<CarLocationId2AddressValobj>> entry : maps.entrySet()) {
                CarLocationCity2AddressesValobj city2AddressesValobj = new CarLocationCity2AddressesValobj();
                city2AddressesValobj.setCity(entry.getKey());
                city2AddressesValobj.setAddresses(entry.getValue());
                city2AddressesValobjs.add(city2AddressesValobj);
            }
    
            response.setCity2AddressesValobjs(city2AddressesValobjs);
            response.setCode(CarResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(CarResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("query associations occur exception :" + e);
            response.setCode(CarResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(CarResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("query associations response->" + response);
        }
        return response;
    }
}
