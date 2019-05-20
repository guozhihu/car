package com.gdou.car.web.controller;

import com.gdou.car.business.car.dal.dto.carInfo.CarInfoQueryListResponse;
import com.gdou.car.business.car.service.CarInfoService;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.common.base.BaseController;
import com.gdou.car.web.controller.support.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/15 17:12
 */
@Anoymous
@RestController
public class CarController extends BaseController {
    
    @Autowired
    private CarInfoService carInfoService;
    
    @GetMapping(value = "carInfo/carInfos")
    public ResponseData queryCarInfos(){
        ResponseData data = new ResponseData();
        CarInfoQueryListResponse response = carInfoService.queryCarInfoAll();
        data.setData(response.getCarInfoValobjs());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
}
