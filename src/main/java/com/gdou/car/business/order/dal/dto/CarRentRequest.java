package com.gdou.car.business.order.dal.dto;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description: 租车请求
 * Date: Create in 2019/5/20 8:53
 */
public class CarRentRequest implements Serializable {
    
    // 添加到数据库中要转换成Long类型
    private String userId;
    
    private String tenantName;
    
    private String carId;
    
    private String contactNumber;
    
    // 添加到数据库中要转换成Date类型
    private String orderGetDate;
    
    // 添加到数据库中要转换成Date类型
    private String orderBackDate;
    
    private String pickUpLocationId;
    
    private String returningLocationId;
    
    private Integer totalPrice;
    
    private Integer penalty;
    
    private String styleName;
    
    private String remarks;
    
    private static final long serialVersionUID = 686223598602508882L;
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getTenantName() {
        return tenantName;
    }
    
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
    
    public String getCarId() {
        return carId;
    }
    
    public void setCarId(String carId) {
        this.carId = carId;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public String getOrderGetDate() {
        return orderGetDate;
    }
    
    public void setOrderGetDate(String orderGetDate) {
        this.orderGetDate = orderGetDate;
    }
    
    public String getOrderBackDate() {
        return orderBackDate;
    }
    
    public void setOrderBackDate(String orderBackDate) {
        this.orderBackDate = orderBackDate;
    }
    
    public String getPickUpLocationId() {
        return pickUpLocationId;
    }
    
    public void setPickUpLocationId(String pickUpLocationId) {
        this.pickUpLocationId = pickUpLocationId;
    }
    
    public String getReturningLocationId() {
        return returningLocationId;
    }
    
    public void setReturningLocationId(String returningLocationId) {
        this.returningLocationId = returningLocationId;
    }
    
    public Integer getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public Integer getPenalty() {
        return penalty;
    }
    
    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }
    
    public String getStyleName() {
        return styleName;
    }
    
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }
    
    public String getRemarks() {
        return remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
