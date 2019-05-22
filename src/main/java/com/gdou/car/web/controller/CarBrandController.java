package com.gdou.car.web.controller;

import com.gdou.car.business.car.dal.dto.carBrand.CarBrandCreateRequest;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandCreateResponse;
import com.gdou.car.business.car.dal.dto.carBrand.CarBrandQueryListResponse;
import com.gdou.car.business.car.service.CarBrandService;
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
 * Date: Create in 2019/5/18 16:12
 */
@Anoymous
@RestController
public class CarBrandController extends BaseController {
    
    @Autowired
    private CarBrandService carBrandService;
    
    @PostMapping("carBrand/carBrand")
    public ResponseData createCarBrand(@RequestBody CarBrandCreateRequest request){
        ResponseData data = new ResponseData();
        CarBrandCreateResponse response = carBrandService.createCarBrand(request);
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carBrand/carBrands")
    public ResponseData queryAll() {
        ResponseData data = new ResponseData();
        CarBrandQueryListResponse response = carBrandService.queryAll();
        data.setData(response.getCarBrands());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
}
