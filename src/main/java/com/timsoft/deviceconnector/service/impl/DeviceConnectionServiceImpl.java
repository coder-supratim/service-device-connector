package com.timsoft.deviceconnector.service.impl;

import com.timsoft.deviceconnector.config.DeviceConnectorServiceConfig;
import com.timsoft.deviceconnector.model.DeviceConnection;
import com.timsoft.deviceconnector.service.DeviceConnectionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class DeviceConnectionServiceImpl implements DeviceConnectionService {

    private final DeviceConnectorServiceConfig deviceConnectorServiceConfig;

    //@Value("${registration.service.endpoint}")
    private final String deviceRegistrationEndpoint = "http://localhost:8081/device-registrar/v1/isregistered/y889id";

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
