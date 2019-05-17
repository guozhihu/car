package com.gdou.car.business.car.dal.entitys;

import java.io.Serializable;

public class CarInfo implements Serializable {
    private String carId;

    private String carTitle;

    private String ageStyle;

    private String carConfiguration;

    private String seriesName;

    private String branId;

    private String modelId;

    private String photoUrl;

    private static final long serialVersionUID = 1L;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarTitle() {
        return carTitle;
    }

    public void setCarTitle(String carTitle) {
        this.carTitle = carTitle == null ? null : carTitle.trim();
    }

    public String getAgeStyle() {
        return ageStyle;
    }

    public void setAgeStyle(String ageStyle) {
        this.ageStyle = ageStyle == null ? null : ageStyle.trim();
    }

    public String getCarConfiguration() {
        return carConfiguration;
    }

    public void setCarConfiguration(String carConfiguration) {
        this.carConfiguration = carConfiguration == null ? null : carConfiguration.trim();
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    public String getBranId() {
        return branId;
    }

    public void setBranId(String branId) {
        this.branId = branId == null ? null : branId.trim();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carId=").append(carId);
        sb.append(", carTitle=").append(carTitle);
        sb.append(", ageStyle=").append(ageStyle);
        sb.append(", carConfiguration=").append(carConfiguration);
        sb.append(", seriesName=").append(seriesName);
        sb.append(", branId=").append(branId);
        sb.append(", modelId=").append(modelId);
        sb.append(", photoUrl=").append(photoUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}