package com.gdou.car.web.controller;

import com.gdou.car.business.car.dal.dto.carModel.CarModelCreateRequest;
import com.gdou.car.business.car.dal.dto.carModel.CarModelCreateResponse;
import com.gdou.car.business.car.dal.dto.carModel.CarModelQueryListResponse;
import com.gdou.car.business.car.service.CarModelService;
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
 * Date: Create in 2019/5/18 16:18
 */
@Anoymous
@RestController
public class CarModelController extends BaseController {
    
    @Autowired
    private CarModelService carModelService;
    
    @PostMapping("carModel/carModel")
    public ResponseData createCarModel(@RequestBody CarModelCreateRequest request){
        ResponseData data = new ResponseData();
        CarModelCreateResponse response = carModelService.createCarModel(request);
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carModel/carModels")
    public ResponseData queryAll() {
        ResponseData data = new ResponseData();
        CarModelQueryListResponse response = carModelService.queryAll();
        data.setData(response.getCarModels());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
}
