package com.timsoft.deviceconnector.app;

import com.github.lalyos.jfiglet.FigletFont;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@Slf4j
@SpringBootApplication(scanBasePackages = {"com.timsoft.deviceconnector"})
public class ServiceDeviceConnectorApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ServiceDeviceConnectorApplication.class, args);
		log.info(FigletFont.convertOneLine("Device Connector"));

	}

}

