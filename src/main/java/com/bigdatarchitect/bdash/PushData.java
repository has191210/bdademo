package com.bigdatarchitect.bdash;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class PushData {

	@Autowired
	private SimpMessagingTemplate template;

	/* @Scheduled(fixedDelay=300000)*/
	 public void schedulePushData(){
		 Date time =new Date();		 
	     template.convertAndSend("/topic/greetings", new Greeting(time.toString()+"Hello psim tester, " +"1111" + "!"));
	 }
	 
	 
	 
	 
}

