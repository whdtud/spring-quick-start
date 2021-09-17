package com.vaccine.service;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.vaccine.util.HttpURLConnUtil;

@Service
public class NaverAPIervice {

	private final String CLIENT_ID = "fyk1cTmv4N75e_IaPr4Z";
	private final String CIENT_SECRET = "Vov7tAp5jM";
	private final String BASE_URL_AUTH = "https://nid.naver.com/oauth2.0/authorize";
	private final String BASE_URL_TOKEN = "https://nid.naver.com/oauth2.0/token";
	private final String REDIRECT_URI_AUTH = "http://localhost:8080/Vaccine/onNaverLoginSuccess.do";
	
	public String auth() throws UnsupportedEncodingException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("response_type", "code");
		params.put("client_id", CLIENT_ID);
		params.put("redirect_uri", URLEncoder.encode(REDIRECT_URI_AUTH, "UTF-8"));
		params.put("state", new BigInteger(130, new SecureRandom()).toString());
		
		String strParams = HttpURLConnUtil.parseParams(params);
		return BASE_URL_AUTH + "?" + strParams;
	}
}
