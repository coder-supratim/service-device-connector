package com.timsoft.deviceconnector.service.impl;

import com.timsoft.deviceconnector.config.DeviceConnectorServiceConfig;
import com.timsoft.deviceconnector.model.DeviceConnection;
import com.timsoft.deviceconnector.service.DeviceConnectionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class DeviceConnectionServiceImpl implements DeviceConnectionService {

    @Autowired
    private DeviceConnectorServiceConfig deviceConnectorServiceConfig;
    @Value("${registration.service.endpoint}")
    private String deviceRegistrationEndpoint;

    @Override
    public DeviceConnection getConnection(String deviceId) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
        ResponseEntity<DeviceRegistration> deviceRegistrationResponse = deviceConnectorServiceConfig.getRestTemplate()
                .exchange(deviceRegistrationEndpoint, HttpMethod.GET, httpEntity, DeviceRegistration.class, deviceId);
        log.info("Device registration service invoked to verify active device for device id {}", deviceId);
        return mockResponse(deviceId);
    }
    private DeviceConnection mockResponse(String deviceId){
        DeviceConnection mockConnection = new DeviceConnection();
        mockConnection.setDeviceId(deviceId);
        mockConnection.setDeviceName("Tim's Ring video doorbell");
        mockConnection.setProvider("Ring");
        mockConnection.setConnectionProtocol("wifi");



    }
}
