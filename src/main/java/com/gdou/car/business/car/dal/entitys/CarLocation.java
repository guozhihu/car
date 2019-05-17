package com.gdou.car.business.car.dal.entitys;

import java.io.Serializable;

public class CarLocation implements Serializable {
    private String locationInfoId;

    private String province;

    private String city;

    private String region;

    private String adress;

    private static final long serialVersionUID = 1L;

    public String getLocationInfoId() {
        return locationInfoId;
    }

    public void setLocationInfoId(String locationInfoId) {
        this.locationInfoId = locationInfoId == null ? null : locationInfoId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", locationInfoId=").append(locationInfoId);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", region=").append(region);
        sb.append(", adress=").append(adress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}