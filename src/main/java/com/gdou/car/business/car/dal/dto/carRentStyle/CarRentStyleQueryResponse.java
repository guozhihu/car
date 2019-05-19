package com.gdou.car.business.car.dal.dto.carRentStyle;

import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 4:56
 */
public class CarRentStyleQueryResponse extends AbstractResponse {
    
    private static final long serialVersionUID = -4338800888381840119L;
    
    private String styleName;
    
    public String getStyleName() {
        return styleName;
    }
    
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
}
