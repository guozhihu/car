package com.gdou.car.business.car.dal.valobj;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 9:13
 */
public class CarLocationId2AddressValobj implements Serializable {
    
    private String locationInfoId;
    private String adress;
    
    private static final long serialVersionUID = 686223598602508882L;
    
    public String getLocationInfoId() {
        return locationInfoId;
    }
    
    public void setLocationInfoId(String locationInfoId) {
        this.locationInfoId = locationInfoId;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
}
