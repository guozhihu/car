package com.gdou.car.business.car.dal.valobj;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/19 7:50
 */
public class CarInfoValobj implements Serializable {
    
    private String carId;
    
    private String carTitle;
    
    private String ageStyle;
    
    private String carConfiguration;
    
    private String seriesName;
    
    // 需要转换
    private String brandName;
    
    // 需要转换
    private String modelName;
    
    private String photoUrl;
    
    private static final long serialVersionUID = 686223598602508882L;
    
    public String getCarId() {
        return carId;
    }
    
    public void setCarId(String carId) {
        this.carId = carId;
    }
    
    public String getCarTitle() {
        return carTitle;
    }
    
    public void setCarTitle(String carTitle) {
        this.carTitle = carTitle;
    }
    
    public String getAgeStyle() {
        return ageStyle;
    }
    
    public void setAgeStyle(String ageStyle) {
        this.ageStyle = ageStyle;
    }
    
    public String getCarConfiguration() {
        return carConfiguration;
    }
    
    public void setCarConfiguration(String carConfiguration) {
        this.carConfiguration = carConfiguration;
    }
    
    public String getSeriesName() {
        return seriesName;
    }
    
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
    
    public String getBrandName() {
        return brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    public String getModelName() {
        return modelName;
    }
    
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    
    public String getPhotoUrl() {
        return photoUrl;
    }
    
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
