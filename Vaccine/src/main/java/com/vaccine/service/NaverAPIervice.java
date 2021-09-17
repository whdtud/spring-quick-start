package com.vaccine.service;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaccine.util.HttpURLConnUtil;

@Service
public class NaverAPIervice {

	private final String CLIENT_ID = "fyk1cTmv4N75e_IaPr4Z";
	private final String CLIENT_SECRET = "Vov7tAp5jM";
	private final String BASE_URL_AUTH = "https://nid.naver.com/oauth2.0/authorize";
	private final String BASE_URL_TOKEN = "https://nid.naver.com/oauth2.0/token";
	private final String BASE_URL_PROFILE = "https://openapi.naver.com/v1/nid/me";
	private final String REDIRECT_URI_AUTH = "http://localhost:8080/Vaccine/onNaverLoginCallback.do";
	
	public String requestAuth(HttpServletRequest request) throws UnsupportedEncodingException {
		String redirectUri = URLEncoder.encode(REDIRECT_URI_AUTH, "UTF-8");
		String state = new BigInteger(130, new SecureRandom()).toString();
		request.getSession().setAttribute("state", state);
		
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("response_type", "code");
		params.put("client_id", CLIENT_ID);
		params.put("redirect_uri", redirectUri);
		params.put("state", state);
		
		String strParams = HttpURLConnUtil.parseParams(params);
		return BASE_URL_AUTH + "?" + strParams;
	}
	
	@SuppressWarnings("unchecked")
	public void requestToken(String code, String state) throws JsonMappingException, JsonProcessingException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("client_id", CLIENT_ID);
		params.put("client_secret", CLIENT_SECRET);
		params.put("grant_type", "authorization_code");
		params.put("state", state);
		params.put("code", code);
		
		String tokenResponse = HttpURLConnUtil.doGetRequest(BASE_URL_TOKEN, null, params);
		
		ObjectMapper tokenMapper = new ObjectMapper();
		Map<String, String> tokenMap = tokenMapper.readValue(tokenResponse, Map.class);
		String accessToken = tokenMap.get("access_token");
		String refreshToken = tokenMap.get("refresh_token");
		String tokenType = tokenMap.get("token_type");
		String expiresIn = tokenMap.get("expires_in");
		
		String header = "Bearer " + accessToken;
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Authorization", header);
		
		String profileResponse = HttpURLConnUtil.doGetRequest(BASE_URL_PROFILE, headers, null);
		
		ObjectMapper profileMapper = new ObjectMapper();
		JsonNode rootNode = profileMapper.readTree(profileResponse);
		JsonNode responseNode = rootNode.get("response");
		String id = responseNode.get("id").toString();
		String email = responseNode.get("email").toString();
		String name = responseNode.get("name").toString();
		String nickname = responseNode.get("nickname").toString();
		String birthday = responseNode.get("birthday").toString();
	}
}
