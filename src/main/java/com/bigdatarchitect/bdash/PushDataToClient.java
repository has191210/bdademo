package com.bigdatarchitect.bdash;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bigdatarchitect.bdash.model.Person;



public class PushDataToClient {

	@Autowired
	private SimpMessagingTemplate template;
	
	
	public void pushData(){
		 Date time =new Date();
		 Person pp = new Person();
		 System.out.println(this.template);
		 pp.setFirstName("First Name");
		 pp.setLastName("Last Name");
	     template.convertAndSend("/topic/greetings", new Greeting(time.toString()+pp.getFirstName()+pp.getLastName()+", " +"1111" + "!"));
	 }

}
