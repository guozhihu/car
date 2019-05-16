package com.gdou.car.business.order.dal.entitys;

import java.io.Serializable;

public class Order extends OrderKey implements Serializable {
    private String drivername;

    private String driverphone;

    private String idcardnum;

    private String ordergetdate;

    private String orderbackdate;

    private String totalprice;

    private String penalty;

    private String rentstyle;

    private static final long serialVersionUID = 1L;

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public String getIdcardnum() {
        return idcardnum;
    }

    public void setIdcardnum(String idcardnum) {
        this.idcardnum = idcardnum == null ? null : idcardnum.trim();
    }

    public String getOrdergetdate() {
        return ordergetdate;
    }

    public void setOrdergetdate(String ordergetdate) {
        this.ordergetdate = ordergetdate == null ? null : ordergetdate.trim();
    }

    public String getOrderbackdate() {
        return orderbackdate;
    }

    public void setOrderbackdate(String orderbackdate) {
        this.orderbackdate = orderbackdate == null ? null : orderbackdate.trim();
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty == null ? null : penalty.trim();
    }

    public String getRentstyle() {
        return rentstyle;
    }

    public void setRentstyle(String rentstyle) {
        this.rentstyle = rentstyle == null ? null : rentstyle.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drivername=").append(drivername);
        sb.append(", driverphone=").append(driverphone);
        sb.append(", idcardnum=").append(idcardnum);
        sb.append(", ordergetdate=").append(ordergetdate);
        sb.append(", orderbackdate=").append(orderbackdate);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", penalty=").append(penalty);
        sb.append(", rentstyle=").append(rentstyle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}