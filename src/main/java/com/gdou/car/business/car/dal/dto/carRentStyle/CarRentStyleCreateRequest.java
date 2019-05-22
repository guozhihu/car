package com.gdou.car.business.car.dal.dto.carRentStyle;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:46
 */
public class CarRentStyleCreateRequest implements Serializable {
    
    private static final long serialVersionUID = 686345698602508882L;
    
    private String styleName;
    
    public String getStyleName() {
        return styleName;
    }
    
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
}
