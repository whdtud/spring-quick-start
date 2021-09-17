package com.vaccine.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HttpURLConnUtil {

	public static String doGetRequest(String baseUrl, Map<String, String> properties,  Map<String, String> params) {
		String url = baseUrl;
		
		String strParams = parseParams(params);
		if (strParams.isEmpty() == false)
			url += "?" + strParams;
		
        try {
            URL urlObj = new URL(url);
            HttpURLConnection con = (HttpURLConnection)urlObj.openConnection();
            con.setRequestMethod("GET");

            if (properties != null) {
            	for (Map.Entry<String, String> entry : properties.entrySet()) {
            		con.setRequestProperty(entry.getKey(), entry.getValue());
            	}
            }
            
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode == 200) { 	// success
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  					// fail
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
            return response.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
	}
	
	public static String doPostRequest(String baseUrl, Map<String, String> properties, Map<String, String> params) {
        try {
            URL url = new URL(baseUrl);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            
            for (Map.Entry<String, String> entry : properties.entrySet()) {
				con.setRequestProperty(entry.getKey(), entry.getValue());
			}
            
            String strParams = parseParams(params);
            if (strParams.isEmpty() == false) {
                con.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                wr.writeBytes(strParams);
                wr.flush();
                wr.close();
            }

            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { 	// success
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  					// fail
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
            return response.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
	}

	public static String doPutRequest(String baseUrl, Map<String, String> properties, String jsonParams) {
        try {
            URL url = new URL(baseUrl);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("PUT");
            
            for (Map.Entry<String, String> entry : properties.entrySet()) {
				con.setRequestProperty(entry.getKey(), entry.getValue());
			}
            
            if (jsonParams.isEmpty() == false) {
                con.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(con.getOutputStream());
                wr.writeBytes(jsonParams);
                wr.flush();
                wr.close();
            }

            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { 	// success
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  					// fail
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
            return response.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
	}
	
	public static String parseParams(Map<String, String> params) {
		if (params == null || params.isEmpty())
			return "";
		
		StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
        	sb.append(entry.getKey());
        	sb.append("=");
        	sb.append(entry.getValue());
        	sb.append("&");
		}
        
        if (sb.lastIndexOf("&") == sb.length() - 1)
        	sb.deleteCharAt(sb.length() - 1);
        
        return sb.toString();
	}
	
	public static String parseParamsToJSON(Map<String, String> params) throws JsonProcessingException {
		if (params == null || params.isEmpty())
			return "";
		
		ObjectMapper mapper = new ObjectMapper();
		
        return mapper.writeValueAsString(params);
	}
}