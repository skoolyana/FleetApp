package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {

	@GetMapping("/vehiclemovements")
	public String getVehiclemovement() {
		return "vehiclemovement";
	}
	
	
	
}
