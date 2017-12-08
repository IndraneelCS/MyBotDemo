package com.swissre.botapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.swissre.botapp.dto.AuthToken;

@Configuration
@PropertySource("classpath:BotApi.properties")
public class BotAuthenticator {

	@Value("${web_auth_url}")
	private String authURL;

	RestTemplate restTemplate;

	public AuthToken getAuthToken() {

		AuthToken token = new AuthToken();

		restTemplate = new RestTemplate();

		System.out.println("Auth URL:  " + authURL);
		restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
		final MultiValueMap<String, String> authRequestParams = new LinkedMultiValueMap<String, String>();
		authRequestParams.add("grant_type", "client_credentials");
		authRequestParams.add("client_id", "d603a841-cb5f-4411-8ebf-25f5fa1bb143");
		authRequestParams.add("client_secret", "iwdboILEIR272}peHH29*+)");
		authRequestParams.add("scope", "https://api.botframework.com/.default");

		try {
			token = restTemplate.postForObject("https://login.microsoftonline.com/botframework.com/oauth2/v2.0/token",
					authRequestParams, AuthToken.class);
			System.out.println(token.toString());
			return token;
		} catch (Exception e) {
			System.out.println("Exception while trying to Authenticate with Microsoft...");
			e.printStackTrace();
		}
		return token;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
