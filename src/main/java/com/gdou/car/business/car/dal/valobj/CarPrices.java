package com.gdou.car.business.car.dal.valobj;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 0:44
 */
public class CarPrices implements Serializable {
    
    private Integer styleId;
    private Integer rentPrice;
    
    private static final long serialVersionUID = 686223598602508882L;
    
    public Integer getStyleId() {
        return styleId;
    }
    
    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }
    
    public Integer getRentPrice() {
        return rentPrice;
    }
    
    public void setRentPrice(Integer rentPrice) {
        this.rentPrice = rentPrice;
    }
}
