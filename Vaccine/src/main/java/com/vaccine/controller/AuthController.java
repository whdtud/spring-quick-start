package com.vaccine.controller;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.vaccine.service.NaverAPIervice;

@Controller
public class AuthController {

	@Resource
	private NaverAPIervice naverAPIService;
	
	@GetMapping("naverAuth.do")
	public String naverAuth() {
		return "naverAuth";
	}

	@PostMapping("naverAuth.do")
	public String naverAuth(HttpServletRequest request) throws UnsupportedEncodingException {
		return "redirect:" + naverAPIService.requestAuth(request);
	}
	
	@GetMapping("onNaverLoginCallback.do")
	public String onNaverLoginCallback(HttpServletRequest request, @RequestParam Map<String, String> params) throws JsonMappingException, JsonProcessingException {
		String code = params.get("code");
		String state = params.get("state");
		String storedState = (String)request.getSession().getAttribute("state");
		
		if (state.equals(storedState)) {
			naverAPIService.requestToken(code, state);
		}
		
		return "naverAuth";
	}
	
	@GetMapping("phoneAuth.do")
	public String phoneAuth() {
		return "phoneAuth";
	}
}
