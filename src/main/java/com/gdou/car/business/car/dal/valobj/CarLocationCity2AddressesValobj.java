package com.gdou.car.business.car.dal.valobj;

import java.io.Serializable;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 9:10
 */
public class CarLocationCity2AddressesValobj implements Serializable {
    
    private String city;
    private List<CarLocationId2AddressValobj> addresses;
    
    private static final long serialVersionUID = 686223598602508882L;
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public List<CarLocationId2AddressValobj> getAddresses() {
        return addresses;
    }
    
    public void setAddresses(List<CarLocationId2AddressValobj> addresses) {
        this.addresses = addresses;
    }
}
