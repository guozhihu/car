package com.gdou.car.business.car.dal.dto.carRelease;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 15:12
 */
public class CarReleaseRequest implements Serializable {
    
    private static final long serialVersionUID = 686223598602508882L;
    
    private String carId;
    private String locationInfoId;
    private Integer availableCount;
    
    public String getCarId() {
        return carId;
    }
    
    public void setCarId(String carId) {
        this.carId = carId;
    }
    
    public String getLocationInfoId() {
        return locationInfoId;
    }
    
    public void setLocationInfoId(String locationInfoId) {
        this.locationInfoId = locationInfoId;
    }
    
    public Integer getAvailableCount() {
        return availableCount;
    }
    
    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }
}
