package com.bwhome.system.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SysUserController {

    @GetMapping("/user/info")
    public Object userInfo(String name) throws InterruptedException {
        System.out.println("执行方法");
        Thread.sleep(1000);
        Map<String, String> map = new HashMap<>();
        map.put("name", "cxm");
        map.put("sex", "nan");
        JSON.toJSONString(map);
        return map;
    }
}
