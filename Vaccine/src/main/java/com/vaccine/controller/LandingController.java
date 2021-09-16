package com.vaccine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingController {
	
	@GetMapping("landing.do")
	public String landing() {
		return "landing";
	}
}
