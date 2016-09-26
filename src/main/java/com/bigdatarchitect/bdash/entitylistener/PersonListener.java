package com.bigdatarchitect.bdash.entitylistener;

import java.util.Date;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.bigdatarchitect.bdash.Greeting;
import com.bigdatarchitect.bdash.helper.AutowireHelper;
import com.bigdatarchitect.bdash.model.Person;




public class PersonListener {
	
	

@Autowired
private SimpMessagingTemplate template;
	
	@PrePersist
	public void userPrePersist(Person ob) {
		System.out.println("Listening User Pre Persist : " + ob.getFirstName());
	}
	@PostPersist
	public void userPostPersist(Person ob) {
		System.out.println("Listening User Post Persist : " + ob.getFirstName());
		 AutowireHelper.autowire(this, this.template);
		 Date time =new Date();		 
	     template.convertAndSend("/topic/greetings", new Greeting(time.toString()+"Hello psim tester, " +"1111" + "!"));
	}
	@PostLoad
	public void userPostLoad(Person ob) {
		System.out.println("Listening User Post Load : " + ob.getFirstName());
	}	
	@PreUpdate
	public void userPreUpdate(Person ob) {
		System.out.println("Listening User Pre Update : " + ob.getFirstName());
	}
	@PostUpdate
	public void userPostUpdate(Person ob) {
		System.out.println("Listening User Post Update : " + ob.getFirstName());
	}
	@PreRemove
	public void userPreRemove(Person ob) {
		System.out.println("Listening User Pre Remove : " + ob.getFirstName());
	}
	@PostRemove
	public void userPostRemove(Person ob) {
		System.out.println("Listening User Post Remove : " + ob.getFirstName());
	}

}
