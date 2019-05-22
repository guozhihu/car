package com.gdou.car.web.controller;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.CarInfoDetailResponse;
import com.gdou.car.business.car.dal.dto.CarSelectResponse;
import com.gdou.car.business.car.dal.dto.carInfo.CarInfoQueryListResponse;
import com.gdou.car.business.car.service.*;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.common.base.BaseController;
import com.gdou.car.web.controller.support.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 8:34
 */
@Anoymous
@RestController
@RequestMapping("carselect")
public class CarSelectController extends BaseController {
    
    @Autowired
    private CarSelectService carSelectService;
    
    /**
     * 根据locationInfoId(地理位置),brandId(品牌),modelId(车型),styleId(租车方式)
     *
     * 请求结果：
     * 数据不存在（001005）或者数据存在（000000）或者系统错误（001099）
     */
    @GetMapping("carInfo/carInfos")
    public ResponseData carInfosWhere(
        @RequestParam(value = "locationInfoId") String locationInfoId,
        @RequestParam(value = "brandId", required = false) String brandId,
        @RequestParam(value = "modelId", required = false) String modelId
    ){
        ResponseData data = new ResponseData();
        
        // 调用地理位置服务获取该地拥有的可租用车辆
        CarSelectResponse response = carSelectService.select(locationInfoId, brandId, modelId);
        
        // 查询的汽车信息不存在
        if (response.getCode().equals(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode())){
            data.setCode(response.getCode());
            data.setMessage(CarResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            return data;
        }
        data.setData(response.getCarInfo2Prices());
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    @GetMapping("carDetail/carDetail")
    public ResponseData queryCarDetail(@RequestParam(value = "carId") String carId){
        ResponseData data = new ResponseData();
        CarInfoDetailResponse response = carSelectService.carDetail(carId);
        data.setData(response);
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
