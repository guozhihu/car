package com.gdou.car.business.car.dal.dto.carBrand;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 2:47
 */
public class CarBrandCreateRequest implements Serializable {
    
    private static final long serialVersionUID = 686993598602508882L;
    
    private String brandName;
    
    public String getBrandName() {
        return brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
