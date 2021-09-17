package com.bwhome.mqtt.service.impl;

import com.bwhome.mqtt.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void add() {
        System.out.println("新增数据");
    }
}
