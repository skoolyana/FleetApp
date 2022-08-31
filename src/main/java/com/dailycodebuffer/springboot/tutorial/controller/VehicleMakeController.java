package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

	@GetMapping("/vehiclemakes")
	public String getVehiclemake() {
		return "vehiclemake";
	}
	
	
}
