package com.vaccine.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IdentificationController {

	@GetMapping("naverLoginSuccess.do")
	public String naverIdentification() {
		
		return "naverIdentification";
	}
	
	@GetMapping("naverIdentification.do")
	public String naverIdentification(Locale locale, Model model) {
		return "naverIdentification";
	}
	
	@PostMapping("naverIdentification.do")
	public String naverIdentification(HttpServletRequest request) {
		
		
		return "";
	}
}
