package com.gdou.car.business.car.dal.dto.carInfo;

import com.gdou.car.api.abs.AbstractResponse;
import com.gdou.car.business.car.dal.valobj.CarInfoValobj;

import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 7:46
 */
public class CarInfoQueryListResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4339900888381840119L;
    
    private List<CarInfoValobj> carInfoValobjs;
    
    public List<CarInfoValobj> getCarInfoValobjs() {
        return carInfoValobjs;
    }
    
    public void setCarInfoValobjs(List<CarInfoValobj> carInfoValobjs) {
        this.carInfoValobjs = carInfoValobjs;
    }
}
