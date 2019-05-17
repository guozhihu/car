package com.gdou.car.business.car.dal.entitys;

import java.io.Serializable;

public class CarConfigInfo implements Serializable {
    private String carId;

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

    private static final long serialVersionUID = 1L;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
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
        this.fuelType = fuelType == null ? null : fuelType.trim();
    }

    public String getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType == null ? null : gearboxType.trim();
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
        this.fuelLabel = fuelLabel == null ? null : fuelLabel.trim();
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode == null ? null : driveMode.trim();
    }

    public String getEngineIntakeForm() {
        return engineIntakeForm;
    }

    public void setEngineIntakeForm(String engineIntakeForm) {
        this.engineIntakeForm = engineIntakeForm == null ? null : engineIntakeForm.trim();
    }

    public String getSkylight() {
        return skylight;
    }

    public void setSkylight(String skylight) {
        this.skylight = skylight == null ? null : skylight.trim();
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
        this.seat = seat == null ? null : seat.trim();
    }

    public String getReversingRadar() {
        return reversingRadar;
    }

    public void setReversingRadar(String reversingRadar) {
        this.reversingRadar = reversingRadar == null ? null : reversingRadar.trim();
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
        this.dvdCd = dvdCd == null ? null : dvdCd.trim();
    }

    public String getGpsNavigation() {
        return gpsNavigation;
    }

    public void setGpsNavigation(String gpsNavigation) {
        this.gpsNavigation = gpsNavigation == null ? null : gpsNavigation.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carId=").append(carId);
        sb.append(", seatNum=").append(seatNum);
        sb.append(", doorsNum=").append(doorsNum);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", gearboxType=").append(gearboxType);
        sb.append(", displacement=").append(displacement);
        sb.append(", fuelLabel=").append(fuelLabel);
        sb.append(", driveMode=").append(driveMode);
        sb.append(", engineIntakeForm=").append(engineIntakeForm);
        sb.append(", skylight=").append(skylight);
        sb.append(", mailboxCapacity=").append(mailboxCapacity);
        sb.append(", speaker=").append(speaker);
        sb.append(", seat=").append(seat);
        sb.append(", reversingRadar=").append(reversingRadar);
        sb.append(", airBag=").append(airBag);
        sb.append(", dvdCd=").append(dvdCd);
        sb.append(", gpsNavigation=").append(gpsNavigation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}