package com.bwhome.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class BwhomeSystemAppilcation {
    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(BwhomeSystemAppilcation.class, args);
    }
}
