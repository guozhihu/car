package com.gdou.car.business.car.dal.entitys;

import java.io.Serializable;

public class CarRelease implements Serializable {
    private String releaseId;

    private String carId;

    private String locationInfoId;

    private Integer availableCount;

    private static final long serialVersionUID = 1L;

    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId == null ? null : releaseId.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getLocationInfoId() {
        return locationInfoId;
    }

    public void setLocationInfoId(String locationInfoId) {
        this.locationInfoId = locationInfoId == null ? null : locationInfoId.trim();
    }

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", releaseId=").append(releaseId);
        sb.append(", carId=").append(carId);
        sb.append(", locationInfoId=").append(locationInfoId);
        sb.append(", availableCount=").append(availableCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}