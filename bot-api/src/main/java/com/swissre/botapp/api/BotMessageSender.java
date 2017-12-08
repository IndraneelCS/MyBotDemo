package com.swissre.botapp.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.swissre.botapp.BotAuthenticator;
import com.swissre.botapp.dto.activity.Activity;
import com.swissre.botapp.dto.AuthToken;
import com.swissre.botapp.dto.Identification;

public class BotMessageSender {

	RestTemplate restTemplate;

	BotAuthenticator auth;

	public boolean replyToBot(Activity activity) {

		boolean messageReplied = false;

		String url = activity.getServiceUrl() + "/v3/conversations/" + activity.getConversation().getId()
				+ "/activities/" + activity.getId();

		auth = new BotAuthenticator();

		AuthToken token = auth.getAuthToken();

		if (token.equals("") || token.equals(null)) {
			System.out.println("Token is empty!!");
		} else {

			Activity responseActivity = new Activity();

			responseActivity.setConversation(activity.getConversation());
			responseActivity.setFrom(activity.getFrom());
			responseActivity.setLocale(activity.getLocale());
			responseActivity.setRecipient(activity.getRecipient());
			responseActivity.setType("message");
			responseActivity.setReplyToId(activity.getId());
			if (activity.getText().equals(null) || activity.getText().equals("") || activity.getText().equals(" ")) {
				responseActivity.setText("Please send me some message... :( ");
			} else {
				responseActivity.setText("Hiii, this is Indraneel ;) ");
			}

			System.out.println(responseActivity.getText());

			restTemplate = new RestTemplate();

			HttpHeaders httpHeaders = new HttpHeaders();

			httpHeaders.add("Authorization", String.format("Bearer %s", token.getAccessToken()));
			httpHeaders.add("Accept", "*/*");

			HttpEntity<Activity> requestEntity = new HttpEntity<Activity>(responseActivity, httpHeaders);

			ResponseEntity<Identification> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity,
					Identification.class);

			System.out.println(responseEntity.getBody().getId());

			if (responseEntity.getBody().getId() != null || responseEntity.getBody().getId() != "") {
				messageReplied = true;
			}

		}

		return messageReplied;
	}
}
