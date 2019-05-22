package com.gdou.car.web.controller;

import com.gdou.car.business.order.dal.dto.CarRent2UserIdResponse;
import com.gdou.car.business.order.dal.dto.CarRentRequest;
import com.gdou.car.business.order.dal.dto.CarRentResponse;
import com.gdou.car.business.order.service.CarRentService;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.web.controller.support.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/20 8:32
 */
@Anoymous
@RestController
public class CarReservationController {
    
    @Autowired
    private CarRentService carRentService;
    
    @PostMapping("carRentalList/carRentalList")
    public ResponseData carRent(@RequestBody CarRentRequest rentRequest){
        ResponseData data = new ResponseData();
        CarRentResponse response = carRentService.reservation(rentRequest);
        data.setData(response.getCarRent());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carRentalList/userId")
    public ResponseData carRentList(@RequestParam("userId") String userId){
        ResponseData data = new ResponseData();
        CarRent2UserIdResponse response = carRentService.getByUserId(Long.parseLong(userId));
        data.setData(response.getCarRents());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carRentalList/listId")
    public ResponseData carRent(@RequestParam("listId") String listId){
        ResponseData data = new ResponseData();
        CarRentResponse response = carRentService.getByListId(listId);
        data.setData(response.getCarRent());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }

}

/**
 ResponseData data = new ResponseData();
 
 data.setCode(response.getCode());
 data.setMessage(response.getMsg());
 return data;
 */

