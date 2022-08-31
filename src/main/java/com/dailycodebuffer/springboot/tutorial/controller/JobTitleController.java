package com.dailycodebuffer.springboot.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

	@GetMapping("/jobtitles")
	public String getJobTitles() {
		return "jobtitle";
	}
	
	
	
}
