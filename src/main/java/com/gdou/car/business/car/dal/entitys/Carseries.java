package com.gdou.car.business.car.dal.entitys;

import java.io.Serializable;

public class Carseries implements Serializable {
    private String seriesid;

    private String modelid;

    private String seriesname;

    private static final long serialVersionUID = 1L;

    public String getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(String seriesid) {
        this.seriesid = seriesid == null ? null : seriesid.trim();
    }

    public String getModelid() {
        return modelid;
    }

    public void setModelid(String modelid) {
        this.modelid = modelid == null ? null : modelid.trim();
    }

    public String getSeriesname() {
        return seriesname;
    }

    public void setSeriesname(String seriesname) {
        this.seriesname = seriesname == null ? null : seriesname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seriesid=").append(seriesid);
        sb.append(", modelid=").append(modelid);
        sb.append(", seriesname=").append(seriesname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}