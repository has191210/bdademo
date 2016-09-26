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
import com.bigdatarchitect.bdash.model.InstanceEventType;

public class InstanceEventTypeListener {

@Autowired
private SimpMessagingTemplate template;
	
	@PrePersist
	public void userPrePersist(InstanceEventType ob) {
	}
	@PostPersist
	public void userPostPersist(InstanceEventType ob) {
		//System.out.println("Listening User Post Persist : " + ob.toString());
		//AutowireHelper.autowire(this, this.template);
		//Date time=new Date();
		/*template.convertAndSend("/topic/greetings", new Greeting(time.toString()+"Hello psim tester, " +"1111" + "!"));*/
		//template.convertAndSend("/topic/greetings", ob);
	}
	@PostLoad
	public void userPostLoad(InstanceEventType ob) {
	}	
	@PreUpdate
	public void userPreUpdate(InstanceEventType ob) {
	}
	@PostUpdate
	public void userPostUpdate(InstanceEventType ob) {
	}
	@PreRemove
	public void userPreRemove(InstanceEventType ob) {
	}
	@PostRemove
	public void userPostRemove(InstanceEventType ob) {
	}

}
