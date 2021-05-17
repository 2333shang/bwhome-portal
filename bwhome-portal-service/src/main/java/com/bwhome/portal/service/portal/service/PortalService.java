package com.bwhome.portal.service.portal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shang
 * @create 2021-05-17 0:56
 */
@Service
@FeignClient("nacos-provider")
public interface PortalService {

    @GetMapping("invoke")
    String invoke();
}
