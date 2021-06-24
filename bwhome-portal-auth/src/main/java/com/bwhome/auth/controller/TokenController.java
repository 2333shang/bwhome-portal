package com.bwhome.auth.controller;

import com.bwhome.api.system.service.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @Autowired
    private RemoteUserService remoteUserService;

    @GetMapping("/user/info")
    public String userInfo(){
        return remoteUserService.getUserInfo();
    }
}
