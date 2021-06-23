package com.bwhome.auth.controller;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TokenController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("userInfo")
    public String userInfo(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("bwhome-system");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/greeting";
        return restTemplate.getForObject(url, String.class);
    }
}
