package com.timsoft.deviceconnector.service.impl;

import com.timsoft.deviceconnector.config.DeviceConnectorServiceConfig;
import com.timsoft.deviceconnector.model.DeviceConnection;
import com.timsoft.deviceconnector.service.DeviceConnectionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class DeviceConnectionServiceImpl implements DeviceConnectionService {

    @Autowired
    private DeviceConnectorServiceConfig deviceConnectorServiceConfig;
    @Value("${registration.service.endpoint}")
    private String deviceRegistrationEndpoint;
    //= "http://localhost:8081/device-registrar/v1/isregistered/y889id";

    @Override
    public DeviceConnection getConnection(String deviceName) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity<DeviceRegistration> deviceRegistrationResponse = deviceConnectorServiceConfig.getRestTemplate()
                .exchange(deviceRegistrationEndpoint, HttpMethod.GET, httpEntity, DeviceRegistration.class, deviceName);
        log.info("Device registration service invoked successfully");
        return new DeviceConnection();
    }
}
