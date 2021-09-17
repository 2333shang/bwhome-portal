package com.bwhome.mqtt.controller;

import com.bwhome.mqtt.config.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("hello")
public class TestController {

    @Autowired
    private MqttGateway mqttGateway;

    @GetMapping("hello")
    public String sendMqtt(@RequestParam("sendData") String sendData){
        mqttGateway.sendToMqtt(sendData, "hello");
        return "ok";
    }
    @RequestMapping("hi")
    public String hello(){
        return "hello";
    }

}
