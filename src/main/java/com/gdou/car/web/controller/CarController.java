package com.gdou.car.web.controller;

import com.gdou.car.business.car.service.CarInfoService;
import com.gdou.car.common.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/15 17:12
 */
@RestController
public class CarController extends BaseController {
    
    @Autowired
    private CarInfoService carInfoService;
    
    
}
