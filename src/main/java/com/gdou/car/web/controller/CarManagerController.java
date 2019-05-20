package com.gdou.car.web.controller;

import com.gdou.car.business.car.constants.CarResponseCodeEnum;
import com.gdou.car.business.car.dal.dto.CarInfoCreateRequest;
import com.gdou.car.business.car.dal.dto.CarInfoCreateResponse;
import com.gdou.car.business.car.dal.dto.PictureUploadResponse;
import com.gdou.car.business.car.dal.dto.carConfigInfo.CarConfigInfoCreateResponse;
import com.gdou.car.business.car.dal.dto.carInfo.CarInfoQueryListResponse;
import com.gdou.car.business.car.dal.dto.carPrice.CarPricesCreateResponse;
import com.gdou.car.business.car.dal.dto.carRelease.CarReleaseRequest;
import com.gdou.car.business.car.dal.dto.carRelease.CarReleaseResponse;
import com.gdou.car.business.car.service.*;
import com.gdou.car.common.annotation.Anoymous;
import com.gdou.car.common.base.BaseController;
import com.gdou.car.web.controller.support.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/17 23:55
 */
@Anoymous
@RestController
public class CarManagerController extends BaseController {
    
    @Autowired
    private CarInfoService carInfoService;
    
    @Autowired
    private CarConfigInfoService carConfigInfoService;
    
    @Autowired
    private CarPriceService carPriceService;
    
    @Autowired
    private FileService fileService;
    
    @Autowired
    private CarReleaseService carReleaseService;
    
    
    /**
     * 添加可用车辆
     *
     * @param request
     * @return
     */
    @PostMapping("car/car")
    public ResponseData createCar(@RequestBody CarInfoCreateRequest request) {
        ResponseData data = new ResponseData();
        // 添加汽车基本信息
        CarInfoCreateResponse carInfoCreateResponse = carInfoService.createCar(request);
        if (!carInfoCreateResponse.getCode().equals(CarResponseCodeEnum.SUCCESS.getCode())) {
            data.setCode(carInfoCreateResponse.getCode());
            data.setMessage(carInfoCreateResponse.getMsg());
            return data;
        }
        
        // 添加汽车详细
        request.setCarId(carInfoCreateResponse.getCarId());
        CarConfigInfoCreateResponse carConfigInfoCreateResponse = carConfigInfoService.createCarConfig(request);
        if (!carConfigInfoCreateResponse.getCode().equals(CarResponseCodeEnum.SUCCESS.getCode())) {
            data.setCode(carConfigInfoCreateResponse.getCode());
            data.setMessage(carConfigInfoCreateResponse.getMsg());
            return data;
        }
        
        // 添加该车的不同租用方式的价格
        CarPricesCreateResponse carPricesCreateResponse = carPriceService.createCarPrices(request);
        if (!carPricesCreateResponse.getCode().equals(CarResponseCodeEnum.SUCCESS.getCode())) {
            data.setCode(carConfigInfoCreateResponse.getCode());
            data.setMessage(carConfigInfoCreateResponse.getMsg());
            return data;
        }
        // 返回汽车id
        data.setData(request.getCarId());
        data.setCode(CarResponseCodeEnum.SUCCESS.getCode());
        data.setMessage(CarResponseCodeEnum.SUCCESS.getMsg());
        return data;
    }
    
    /**
     * 上传文件
     *
     * @param file post请求
     * @return
     */
    @RequestMapping(value = "car/file")
    @ResponseBody
    public ResponseData upload(@RequestParam("uploadFile") MultipartFile file, @RequestParam("carId") String carId) {
        ResponseData data = new ResponseData();
        PictureUploadResponse response = fileService.uplodaFile(file, carId);
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
    /**
     * 汽车发布
     * @param request
     * @return
     */
    @PostMapping(value = "release/car")
    public ResponseData releaseCar(@RequestBody CarReleaseRequest request) {
        ResponseData data = new ResponseData();
        CarReleaseResponse response = carReleaseService.release(request);
        data.setCode(response.getCode());
        data.setMessage(response.getMsg());
        return data;
    }
    
}
