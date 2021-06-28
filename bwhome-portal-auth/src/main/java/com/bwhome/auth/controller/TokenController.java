package com.bwhome.auth.controller;


import com.bwhome.common.core.annotation.RepeatSubmit;
import com.bwhome.common.core.web.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    @GetMapping("/login")
    @RepeatSubmit
    public AjaxResult login(){
        return AjaxResult.success();
    }

    public AjaxResult logout(){

        return AjaxResult.success();
    }

    public AjaxResult refreshToken(){

        return AjaxResult.success();
    }


}
