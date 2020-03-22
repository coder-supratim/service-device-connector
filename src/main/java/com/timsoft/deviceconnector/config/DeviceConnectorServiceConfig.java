package com.timsoft.deviceconnector.config;


import brave.sampler.Sampler;
import org.springframework.cloud.sleuth.sampler.SamplerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DeviceConnectorServiceConfig {


    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }


    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
