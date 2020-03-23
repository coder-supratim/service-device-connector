package com.timsoft.deviceconnector.service;


import com.timsoft.deviceconnector.model.DeviceConnection;

public interface DeviceConnectionService {

    DeviceConnection getConnection (String deviceName);

}
