package com.vaccine.biz;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IdentificationController {

	@RequestMapping(value = "/svc/naver", method = RequestMethod.GET)
	public String naver(Locale locale, Model model) {
		
		return "";
	}
}
