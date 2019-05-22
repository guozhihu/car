package com.gdou.car.business.order.dal.valobj;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/20 9:13
 */
public class CarRentObj implements Serializable {
    private String listId;
    
    private String tenantName;
    
    private String carTitle;
    
    // 需要转换
    private String createTime;
    
    private String contactNumber;
    
    // 需要转换
    private String orderGetDate;
    
    // 需要转换
    private String orderBackDate;
    
    // 需要转换
    private String renewalDate;
    
    // 需要转换
    private String pickUpLocation;
    
    // 需要转换
    private String returningLocation;
    
    private Integer totalPrice;
    
    private Integer penalty;
    
    private String styleName;
    
    private String remarks;
    
    private static final long serialVersionUID = 686223598602508882L;
    
    public String getListId() {
        return listId;
    }
    
    public void setListId(String listId) {
        this.listId = listId;
    }
    
    public String getTenantName() {
        return tenantName;
    }
    
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }
    
    public String getCarTitle() {
        return carTitle;
    }
    
    public void setCarTitle(String carTitle) {
        this.carTitle = carTitle;
    }
    
    public String getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
    
    public String getRenewalDate() {
        return renewalDate;
    }
    
    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }
    
    public String getPickUpLocation() {
        return pickUpLocation;
    }
    
    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }
    
    public String getReturningLocation() {
        return returningLocation;
    }
    
    public void setReturningLocation(String returningLocation) {
        this.returningLocation = returningLocation;
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
