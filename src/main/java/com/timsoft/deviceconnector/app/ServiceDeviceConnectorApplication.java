package com.timsoft.deviceconnector.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.timsoft.deviceconnector"})
public class ServiceDeviceConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDeviceConnectorApplication.class, args);
	}

}

