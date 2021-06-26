package com.bwhome.register.service;

import bwhome.common.core.web.domain.AjaxResult;
import com.bwhome.register.form.RegisterBody;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping("/register")
    public AjaxResult register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("phoneNum") String phoneNum){
        if ("cxm".equals(username) && "1998.cxm".equals(password)){
            String messageId = String.valueOf(UUID.randomUUID());
            String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd :HH:mm:ss"));
            Map<String, Object> map = new HashMap<>();
            map.put("messageId", messageId);
            map.put("createTime", createTime);
            map.put("messageData", new RegisterBody(username, password ,phoneNum));
            rabbitTemplate.convertAndSend("sendMessageExchange","sendMessageRouting", map);
            return AjaxResult.success();
        }
       return AjaxResult.error();
    }
}
