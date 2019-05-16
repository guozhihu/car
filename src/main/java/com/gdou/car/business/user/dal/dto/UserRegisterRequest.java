package com.gdou.car.business.user.dal.dto;

import com.gdou.car.api.abs.AbstractRequest;

import java.io.Serializable;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/10 21:13
 */
public class UserRegisterRequest extends AbstractRequest implements Serializable {
    
    private static final long serialVersionUID = -4807481139973253990L;
    
    private String userName;
    
    private String userPassword;
    
    private String realName;
    
    private String credentialsId;
    
    private String busLicense;
    
    private String address;
    
    private String phoneNumber;
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserPassword() {
        return userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    public String getRealName() {
        return realName;
    }
    
    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    public String getCredentialsId() {
        return credentialsId;
    }
    
    public void setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
    }
    
    public String getBusLicense() {
        return busLicense;
    }
    
    public void setBusLicense(String busLicense) {
        this.busLicense = busLicense;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return "UserRegisterRequest{" +
            "userName='" + userName + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", realName='" + realName + '\'' +
            ", credentialsId='" + credentialsId + '\'' +
            ", busLicense='" + busLicense + '\'' +
            ", address='" + address + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            "} " + super.toString();
    }
}