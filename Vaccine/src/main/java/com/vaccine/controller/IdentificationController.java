package com.vaccine.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vaccine.service.NaverAPIervice;

@Controller
public class IdentificationController {

	@Resource
	private NaverAPIervice naverAPIService;
	
	@GetMapping("naverIdentification.do")
	public String naverIdentification() {
		return "naverIdentification";
	}

	@PostMapping("naverAuth.do")
	public String naverAuth() throws UnsupportedEncodingException {
		return "redirect:" + naverAPIService.auth();
	}
	
	@GetMapping("onNaverLoginSuccess.do")
	public String onNaverLoginSuccess() {
		
		
		return "naverIdentification";
	}
	
	@PostMapping("naverIdentification.do")
	public String naverIdentification(HttpServletRequest request) {
		
		
		return "";
	}
}
