package com.timsoft.deviceconnector.service.impl;

import java.time.Instant;

public class DeviceRegistration {

    private String deviceUniqueId;

    private String deviceType;

    private String brand;

    private String qrCode;

    private boolean isRegistrationActive;

    private Instant registrationExpirationDate;

    private Instant deviceRegistrationDate;

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public boolean isRegistrationActive() {
        return isRegistrationActive;
    }

    public void setRegistrationActive(boolean registrationActive) {
        isRegistrationActive = registrationActive;
    }

    public Instant getRegistrationExpirationDate() {
        return registrationExpirationDate;
    }

    public void setRegistrationExpirationDate(Instant registrationExpirationDate) {
        this.registrationExpirationDate = registrationExpirationDate;
    }

    public Instant getDeviceRegistrationDate() {
        return deviceRegistrationDate;
    }

    public void setDeviceRegistrationDate(Instant deviceRegistrationDate) {
        this.deviceRegistrationDate = deviceRegistrationDate;
    }

    public String getDeviceUniqueId() {
        return deviceUniqueId;
    }

    public void setDeviceUniqueId(String deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }
}
