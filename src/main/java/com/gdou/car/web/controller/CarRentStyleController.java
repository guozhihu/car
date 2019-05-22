package com.gdou.car.web.controller;

import com.gdou.car.business.car.dal.dto.carRentStyle.CarRentStyleQueryListResponse;
import com.gdou.car.business.car.service.CarRentStyleService;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.common.base.BaseController;
import com.gdou.car.web.controller.support.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 16:52
 */
@Anoymous
@RestController
public class CarRentStyleController extends BaseController {
    
    @Autowired
    private CarRentStyleService carRentStyleService;
    
    @GetMapping(value = "carRentStyle/carRentStyles")
    public ResponseData queryAllCarRentStyle(){
        ResponseData data = new ResponseData();
        CarRentStyleQueryListResponse response = carRentStyleService.queryAll();
        data.setData(response.getCarRentStyles());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
}
