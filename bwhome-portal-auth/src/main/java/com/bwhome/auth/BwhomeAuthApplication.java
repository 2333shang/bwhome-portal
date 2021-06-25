package com.bwhome.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.bwhome.api.system.service")
@SpringBootApplication
public class BwhomeAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(BwhomeAuthApplication.class, args);
        System.out.println("认证中心启动成功");
    }
}
