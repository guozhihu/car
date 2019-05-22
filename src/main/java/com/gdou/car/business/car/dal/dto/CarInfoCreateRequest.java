package com.gdou.car.business.car.dal.dto;

import com.gdou.car.business.car.dal.valobj.CarPrices;

import java.io.Serializable;
import java.util.List;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 2019/5/17 23:50
 */
public class CarInfoCreateRequest implements Serializable {
    
    private static final long serialVersionUID = 686223598602508882L;
    
    private String carId;
    
    // 汽车基本信息
    private String carTitle;
    private String ageStyle;
    private String carConfiguration;
    private String seriesName;
    private String branId;
    private String modelId;
    
    // 汽车配置信息参数
    private Integer seatNum;
    private Integer doorsNum;
    private String fuelType;
    private String gearboxType;
    private Integer displacement;
    private String fuelLabel;
    private String driveMode;
    private String engineIntakeForm;
    private String skylight;
    private Integer mailboxCapacity;
    private Integer speaker;
    private String seat;
    private String reversingRadar;
    private Integer airBag;
    private String dvdCd;
    private String gpsNavigation;
    
    // 各种租车方式价格
    private List<CarPrices> carPrices;
    
    public String getCarId() {
        return carId;
    }
    
    public void setCarId(String carId) {
        this.carId = carId;
    }
    
    public String getCarTitle() {
        return carTitle;
    }
    
    public void setCarTitle(String carTitle) {
        this.carTitle = carTitle;
    }
    
    public String getAgeStyle() {
        return ageStyle;
    }
    
    public void setAgeStyle(String ageStyle) {
        this.ageStyle = ageStyle;
    }
    
    public String getCarConfiguration() {
        return carConfiguration;
    }
    
    public void setCarConfiguration(String carConfiguration) {
        this.carConfiguration = carConfiguration;
    }
    
    public String getSeriesName() {
        return seriesName;
    }
    
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
    
    public String getBranId() {
        return branId;
    }
    
    public void setBranId(String branId) {
        this.branId = branId;
    }
    
    public String getModelId() {
        return modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
    
    public Integer getSeatNum() {
        return seatNum;
    }
    
    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }
    
    public Integer getDoorsNum() {
        return doorsNum;
    }
    
    public void setDoorsNum(Integer doorsNum) {
        this.doorsNum = doorsNum;
    }
    
    public String getFuelType() {
        return fuelType;
    }
    
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    public String getGearboxType() {
        return gearboxType;
    }
    
    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }
    
    public Integer getDisplacement() {
        return displacement;
    }
    
    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }
    
    public String getFuelLabel() {
        return fuelLabel;
    }
    
    public void setFuelLabel(String fuelLabel) {
        this.fuelLabel = fuelLabel;
    }
    
    public String getDriveMode() {
        return driveMode;
    }
    
    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }
    
    public String getEngineIntakeForm() {
        return engineIntakeForm;
    }
    
    public void setEngineIntakeForm(String engineIntakeForm) {
        this.engineIntakeForm = engineIntakeForm;
    }
    
    public String getSkylight() {
        return skylight;
    }
    
    public void setSkylight(String skylight) {
        this.skylight = skylight;
    }
    
    public Integer getMailboxCapacity() {
        return mailboxCapacity;
    }
    
    public void setMailboxCapacity(Integer mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
    
    public Integer getSpeaker() {
        return speaker;
    }
    
    public void setSpeaker(Integer speaker) {
        this.speaker = speaker;
    }
    
    public String getSeat() {
        return seat;
    }
    
    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    public String getReversingRadar() {
        return reversingRadar;
    }
    
    public void setReversingRadar(String reversingRadar) {
        this.reversingRadar = reversingRadar;
    }
    
    public Integer getAirBag() {
        return airBag;
    }
    
    public void setAirBag(Integer airBag) {
        this.airBag = airBag;
    }
    
    public String getDvdCd() {
        return dvdCd;
    }
    
    public void setDvdCd(String dvdCd) {
        this.dvdCd = dvdCd;
    }
    
    public String getGpsNavigation() {
        return gpsNavigation;
    }
    
    public void setGpsNavigation(String gpsNavigation) {
        this.gpsNavigation = gpsNavigation;
    }
    
    public List<CarPrices> getCarPrices() {
        return carPrices;
    }
    
    public void setCarPrices(List<CarPrices> carPrices) {
        this.carPrices = carPrices;
    }
}
