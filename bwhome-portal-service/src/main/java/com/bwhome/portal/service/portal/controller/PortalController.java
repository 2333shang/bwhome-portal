package com.bwhome.portal.service.portal.controller;

import com.bwhome.portal.service.portal.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {

	@Autowired
	private PortalService portalService;
	
	@GetMapping("/test")
	public String test() {
		return portalService.invoke();
	}
}
