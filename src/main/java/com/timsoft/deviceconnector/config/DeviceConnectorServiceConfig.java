package com.timsoft.deviceconnector.config;


import brave.sampler.Sampler;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@AllArgsConstructor
public class DeviceConnectorServiceConfig {


    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }


    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
