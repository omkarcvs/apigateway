package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String getUserServiceFallback()
	{
		 return "User Service is down at this time!!";	 
	}
	
	@GetMapping("/contactServiceFallback")
	public String getContactServiceFallback()
	{
		 return "Contact Service is down at this time!!";	 
	}
	
	@GetMapping("/hystrixDashboardServiceFallback")
	public String getHystrixDashboardServiceFallback()
	{
		 return "Hystrix Dashboard Service is down at this time!!";	 
	}
	
}
