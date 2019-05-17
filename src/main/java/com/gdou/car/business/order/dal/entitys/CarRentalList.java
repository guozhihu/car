package com.gdou.car.business.order.dal.entitys;

import java.io.Serializable;
import java.util.Date;

public class CarRentalList implements Serializable {
    private String listId;

    private Long userId;

    private String tenantName;

    private String carId;

    private Date createTime;

    private String contactNumber;

    private Date orderGetDate;

    private Date orderBackDate;

    private Date renewalDate;

    private String pickUpLocationId;

    private String returningLocationId;

    private Integer totalPrice;

    private Integer penalty;

    private String styleName;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getListId() {
        return listId;
    }

    public void setListId(String listId) {
        this.listId = listId == null ? null : listId.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName == null ? null : tenantName.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Date getOrderGetDate() {
        return orderGetDate;
    }

    public void setOrderGetDate(Date orderGetDate) {
        this.orderGetDate = orderGetDate;
    }

    public Date getOrderBackDate() {
        return orderBackDate;
    }

    public void setOrderBackDate(Date orderBackDate) {
        this.orderBackDate = orderBackDate;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public String getPickUpLocationId() {
        return pickUpLocationId;
    }

    public void setPickUpLocationId(String pickUpLocationId) {
        this.pickUpLocationId = pickUpLocationId == null ? null : pickUpLocationId.trim();
    }

    public String getReturningLocationId() {
        return returningLocationId;
    }

    public void setReturningLocationId(String returningLocationId) {
        this.returningLocationId = returningLocationId == null ? null : returningLocationId.trim();
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
        this.styleName = styleName == null ? null : styleName.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", listId=").append(listId);
        sb.append(", userId=").append(userId);
        sb.append(", tenantName=").append(tenantName);
        sb.append(", carId=").append(carId);
        sb.append(", createTime=").append(createTime);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", orderGetDate=").append(orderGetDate);
        sb.append(", orderBackDate=").append(orderBackDate);
        sb.append(", renewalDate=").append(renewalDate);
        sb.append(", pickUpLocationId=").append(pickUpLocationId);
        sb.append(", returningLocationId=").append(returningLocationId);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", penalty=").append(penalty);
        sb.append(", styleName=").append(styleName);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}