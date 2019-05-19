package com.gdou.car.business.car.dal.dto.carLocation;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:37
 */
public class CarLocationCreateRequest implements Serializable {
    
    private static final long serialVersionUID = 686223598602508882L;
    
    private String province;
    private String city;
    private String region;
    private String adress;
    
    public String getProvince() {
        return province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getRegion() {
        return region;
    }
    
    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
}
