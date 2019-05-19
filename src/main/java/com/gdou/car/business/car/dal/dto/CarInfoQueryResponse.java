package com.gdou.car.business.car.dal.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gdou.car.api.abs.AbstractResponse;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/18 2:15
 */
public class CarInfoQueryResponse extends AbstractResponse {
    
    private String carId;
    
    private String carTitle;
    
    private String ageStyle;
    
    private String carConfiguration;
    
    private String seriesName;
    
    @JsonIgnore
    private String branId;
    
    @JsonIgnore
    private String modelId;
    
    private String brandName;
    
    private String modelName;
    
    private String photoUrl;
    
    private static final long serialVersionUID = -4339966548381840119L;
    
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
    
    public String getBranId() {
        return branId;
    }
    
    public void setBranId(String branId) {
        this.branId = branId;
    }
    
    public String getModelId() {
        return modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
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
