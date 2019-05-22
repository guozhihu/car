package com.gdou.car.business.order.service.impl;

import com.gdou.car.business.car.dal.entitys.CarInfo;
import com.gdou.car.business.car.dal.entitys.CarLocation;
import com.gdou.car.business.car.dal.persistence.CarInfoMapper;
import com.gdou.car.business.car.dal.persistence.CarLocationMapper;
import com.gdou.car.business.order.constants.OrderResponseCodeEnum;
import com.gdou.car.business.order.dal.dto.CarRent2UserIdResponse;
import com.gdou.car.business.order.dal.dto.CarRentRequest;
import com.gdou.car.business.order.dal.dto.CarRentResponse;
import com.gdou.car.business.order.dal.entitys.CarRentalList;
import com.gdou.car.business.order.dal.entitys.CarRentalListExample;
import com.gdou.car.business.order.dal.persistence.CarRentalListMapper;
import com.gdou.car.business.order.dal.valobj.CarRentObj;
import com.gdou.car.business.order.service.CarRentService;
import com.gdou.car.business.order.utils.DateUtil;
import com.gdou.car.common.utils.RandomUtils;
import org.codehaus.jackson.map.util.BeanUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/17 22:41
 */
@Service
public class CarRentServiceImpl implements CarRentService {
    
    private final Logger Log = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private CarRentalListMapper carRentalListMapper;
    
    @Autowired
    private CarLocationMapper carLocationMapper;
    
    @Autowired
    private CarInfoMapper carInfoMapper;
    
    /**
     * 时间格式: "yyyy-MM-dd HH:mm:ss".
     * @param rentRequest
     * @return
     */
    @Override
    public CarRentResponse reservation(CarRentRequest rentRequest) {
        Log.info("car rent request:" + rentRequest);
    
        CarRentResponse response = new CarRentResponse();
        try {
            // 将租单请求转化成租单实体
            CarRentalList carRentalList = new CarRentalList();
            BeanUtils.copyProperties(rentRequest, carRentalList);
            // 生成租单编号
            String listId = RandomUtils.generateString(32);
            carRentalList.setListId(listId);
            carRentalList.setUserId(Long.parseLong(rentRequest.getUserId()));
            carRentalList.setCreateTime(new Date());
            carRentalList.setOrderBackDate(DateUtil.parseDateTime(rentRequest.getOrderBackDate()));
            carRentalList.setOrderGetDate(DateUtil.parseDateTime(rentRequest.getOrderGetDate()));
            this.carRentalListMapper.insertSelective(carRentalList);
    
            // 封装返回的响应实体-租单信息内容
            CarRentObj obj = new CarRentObj();
            BeanUtils.copyProperties(rentRequest, obj);
            CarLocation pickUpLocation = carLocationMapper.selectByPrimaryKey(carRentalList.getPickUpLocationId());
            CarLocation returningLocation = carLocationMapper.selectByPrimaryKey(carRentalList.getReturningLocationId());
            CarInfo carInfo = carInfoMapper.selectByPrimaryKey(rentRequest.getCarId());
            obj.setPickUpLocation(pickUpLocation.getProvince() + pickUpLocation.getCity() + pickUpLocation.getRegion() + pickUpLocation.getAdress());
            obj.setReturningLocation(returningLocation.getProvince() + returningLocation.getCity() + returningLocation.getRegion() + returningLocation.getAdress());
            obj.setListId(listId);
            obj.setCarTitle(carInfo.getCarTitle());

            response.setCarRent(obj);
            response.setCode(OrderResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(OrderResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("car rent occur exception :" + e);
            response.setCode(OrderResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(OrderResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("car rent response->" + response);
        }
        return response;
    }
    
    @Override
    public CarRent2UserIdResponse getByUserId(Long userId) {
        Log.info("query carRent by userId request:" + userId);
    
        CarRent2UserIdResponse response = new CarRent2UserIdResponse();
        try {
            CarRentalListExample example = new CarRentalListExample();
            CarRentalListExample.Criteria criteria = example.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<CarRentalList> carRentalLists = carRentalListMapper.selectByExampleWithBLOBs(example);
            if (CollectionUtils.isEmpty(carRentalLists)) {
                response.setCode(OrderResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
                response.setMsg(OrderResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            } else {
                List<CarRentObj> carRents = new ArrayList<CarRentObj>();
                for (CarRentalList c : carRentalLists) {
                    CarRentObj cro = carRentalList2CarRentObj(c);
                    carRents.add(cro);
                }
                response.setCarRents(carRents);
                response.setCode(OrderResponseCodeEnum.SUCCESS.getCode());
                response.setMsg(OrderResponseCodeEnum.SUCCESS.getMsg());
            }
        } catch (Exception e) {
            Log.error("query carRent by userId occur exception :" + e);
            response.setCode(OrderResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(OrderResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("query carRent by userId response->" + response);
        }
        return response;
    }
    
    @Override
    public CarRentResponse getByListId(String listId) {
        Log.info("query carRent by listId request:" + listId);
    
        CarRentResponse response = new CarRentResponse();
        try {
            CarRentalList carRentalList = carRentalListMapper.selectByPrimaryKey(listId);
            CarRentObj carRentObj = carRentalList2CarRentObj(carRentalList);
            response.setCarRent(carRentObj);
            response.setCode(OrderResponseCodeEnum.SUCCESS.getCode());
            response.setMsg(OrderResponseCodeEnum.SUCCESS.getMsg());
        } catch (Exception e) {
            Log.error("query carRent by listId occur exception :" + e);
            response.setCode(OrderResponseCodeEnum.SYSTEM_BUSY.getCode());
            response.setMsg(OrderResponseCodeEnum.SYSTEM_BUSY.getMsg());
        } finally {
            Log.info("query carRent by listId response->" + response);
        }
        return response;
    }
    
    // 将CarRentalList实体对象转化为CarRentObj表单对象
    public CarRentObj carRentalList2CarRentObj(CarRentalList c){
        CarRentObj carRentObj = new CarRentObj();
        BeanUtils.copyProperties(c, carRentObj);
        CarLocation pickUpLocation = carLocationMapper.selectByPrimaryKey(c.getPickUpLocationId());
        CarLocation returningLocation = carLocationMapper.selectByPrimaryKey(c.getReturningLocationId());
        CarInfo carInfo = carInfoMapper.selectByPrimaryKey(c.getCarId());
        carRentObj.setPickUpLocation(pickUpLocation.getProvince() + pickUpLocation.getCity() + pickUpLocation.getRegion() + pickUpLocation.getAdress());
        carRentObj.setReturningLocation(returningLocation.getProvince() + returningLocation.getCity() + returningLocation.getRegion() + returningLocation.getAdress());
        carRentObj.setListId(c.getListId());
        carRentObj.setOrderGetDate(DateUtil.formatDateByFormat(c.getOrderGetDate(), DateUtil.DATETIME_FORMAT));
        carRentObj.setOrderBackDate(DateUtil.formatDateByFormat(c.getOrderBackDate(), DateUtil.DATETIME_FORMAT));
        carRentObj.setCarTitle(carInfo.getCarTitle());
        return carRentObj;
    }
}
