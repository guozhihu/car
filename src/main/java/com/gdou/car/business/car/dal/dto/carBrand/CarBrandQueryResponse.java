package com.gdou.car.business.car.dal.dto.carBrand;

import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 2:49
 */
public class CarBrandQueryResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4338800888381840119L;
    
    private String brandName;
    
    public String getBrandName() {
        return brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
