package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {

	@GetMapping("/locations")
	public String getLocations() {
		return "location";
	}
	
	
}
