package com.gdou.car.business.car.dal.valobj;

import java.io.Serializable;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 16:11
 */
public class CarInfo2Prices implements Serializable {
    
    private CarInfoValobj carInfoValobj;
    private List<CarPrices> carPrices;
    private static final long serialVersionUID = 686223598602508882L;
    
    public CarInfoValobj getCarInfoValobj() {
        return carInfoValobj;
    }
    
    public void setCarInfoValobj(CarInfoValobj carInfoValobj) {
        this.carInfoValobj = carInfoValobj;
    }
    
    public List<CarPrices> getCarPrices() {
        return carPrices;
    }
    
    public void setCarPrices(List<CarPrices> carPrices) {
        this.carPrices = carPrices;
    }
}
