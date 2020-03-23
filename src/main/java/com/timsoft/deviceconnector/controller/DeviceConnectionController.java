package com.timsoft.deviceconnector.controller;

import com.timsoft.deviceconnector.model.DeviceConnection;
import com.timsoft.deviceconnector.service.DeviceConnectionService;
import com.timsoft.deviceconnector.service.impl.DeviceConnectionServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/device-connect/v1")
@AllArgsConstructor
public class DeviceConnectionController {
    private final DeviceConnectionService deviceConnectionService;
    @GetMapping(value = "/device/{deviceName}", produces = "application/json")
    public ResponseEntity<DeviceConnection> getConnection(@PathVariable String deviceName){
       log.info("Device connection Get API invoked {}", deviceName);

       return ResponseEntity.ok(deviceConnectionService.getConnection(deviceName));
    }

}
