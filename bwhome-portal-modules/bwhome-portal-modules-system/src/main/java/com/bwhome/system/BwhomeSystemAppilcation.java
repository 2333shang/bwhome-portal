package com.bwhome.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BwhomeSystemAppilcation {
    public static void main(String[] args) {
        SpringApplication.run(BwhomeSystemAppilcation.class, args);
    }
}
