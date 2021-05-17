package com.bwhome.portal.service.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BwhomePortalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BwhomePortalServiceApplication.class, args);
    }

}
