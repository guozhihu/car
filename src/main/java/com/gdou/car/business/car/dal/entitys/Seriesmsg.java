package com.gdou.car.business.car.dal.entitys;

import java.io.Serializable;

public class Seriesmsg implements Serializable {
    private String seriesid;

    private String carphoto;

    private String productiondate;

    private String level;

    private String availablecount;

    private String price;

    private static final long serialVersionUID = 1L;

    public String getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(String seriesid) {
        this.seriesid = seriesid == null ? null : seriesid.trim();
    }

    public String getCarphoto() {
        return carphoto;
    }

    public void setCarphoto(String carphoto) {
        this.carphoto = carphoto == null ? null : carphoto.trim();
    }

    public String getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(String productiondate) {
        this.productiondate = productiondate == null ? null : productiondate.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getAvailablecount() {
        return availablecount;
    }

    public void setAvailablecount(String availablecount) {
        this.availablecount = availablecount == null ? null : availablecount.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seriesid=").append(seriesid);
        sb.append(", carphoto=").append(carphoto);
        sb.append(", productiondate=").append(productiondate);
        sb.append(", level=").append(level);
        sb.append(", availablecount=").append(availablecount);
        sb.append(", price=").append(price);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}