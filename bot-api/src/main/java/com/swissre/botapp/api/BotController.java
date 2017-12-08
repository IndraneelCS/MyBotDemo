package com.swissre.botapp.api;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.swissre.botapp.dto.activity.Activity;

@RestController
public class BotController {

	@RequestMapping(value = "/messages", method = RequestMethod.POST)
	public void message(@RequestBody Activity activity) {
		BotMessageSender messageSender = new BotMessageSender();
		Boolean response = messageSender.replyToBot(activity);
		
		if(response == true){
			System.out.println("Message has been responded to..");
		} else {
			System.out.println("Message has not been responded to..");
		}
	}
}
