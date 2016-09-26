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

import com.bigdatarchitect.bdash.helper.AutowireHelper;
import com.bigdatarchitect.bdash.model.InstanceEvent;

public class InstanceEventListener {

@Autowired
private SimpMessagingTemplate template;
	
	@PrePersist
	public void userPrePersist(InstanceEvent ob) {
	}
	@PostPersist
	public void userPostPersist(InstanceEvent ob) {
		System.out.println("Listening User Post Persist : " + ob.toString());
		 AutowireHelper.autowire(this, this.template);
		 Date time=new Date();
	     /*template.convertAndSend("/topic/greetings", new Greeting(time.toString()+"Hello psim tester, " +"1111" + "!"));*/
		 System.out.println(".............."+ob.toString()+"..............");
	     template.convertAndSend("/topic/greetings", ob);
	}
	@PostLoad
	public void userPostLoad(InstanceEvent ob) {
	}	
	@PreUpdate
	public void userPreUpdate(InstanceEvent ob) {
	}
	@PostUpdate
	public void userPostUpdate(InstanceEvent ob) {
	}
	@PreRemove
	public void userPreRemove(InstanceEvent ob) {
	}
	@PostRemove
	public void userPostRemove(InstanceEvent ob) {
	}

}
