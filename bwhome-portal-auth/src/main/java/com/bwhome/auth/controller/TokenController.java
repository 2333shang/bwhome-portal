package com.bwhome.auth.controller;


import bwhome.common.core.web.domain.AjaxResult;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

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
