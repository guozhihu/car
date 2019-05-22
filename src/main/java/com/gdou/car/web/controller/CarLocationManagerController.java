package com.gdou.car.web.controller;

import com.gdou.car.business.car.dal.dto.carLocation.CarLocationAssociationResponse;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateRequest;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationCreateResponse;
import com.gdou.car.business.car.dal.dto.carLocation.CarLocationQueryListResponse;
import com.gdou.car.business.car.service.CarLocationService;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.common.base.BaseController;
import com.gdou.car.web.controller.support.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:32
 */
@Anoymous
@RestController
public class CarLocationManagerController extends BaseController {

    @Autowired
    private CarLocationService carLocationService;
    
    @PostMapping("carLocation/carLocation")
    public ResponseData createCarLocation(@RequestBody CarLocationCreateRequest request) {
        ResponseData data = new ResponseData();
        CarLocationCreateResponse response = carLocationService.createCarLocation(request);
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carLocation/carLocations")
    public ResponseData queryAll() {
        ResponseData data = new ResponseData();
        CarLocationQueryListResponse response = carLocationService.queryAll();
        data.setData(response.getCarLocations());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carLocation/city2addresses")
    public ResponseData queryCity2Addresses() {
        ResponseData data = new ResponseData();
        CarLocationAssociationResponse response = carLocationService.queryCity2Addresses();
        data.setData(response.getCity2AddressesValobjs());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
}
