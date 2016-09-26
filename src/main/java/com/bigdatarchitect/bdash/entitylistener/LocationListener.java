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
import com.bigdatarchitect.bdash.model.Location;

public class LocationListener {

@Autowired
private SimpMessagingTemplate template;
	
	@PrePersist
	public void userPrePersist(Location ob) {
	}
	@PostPersist
	public void userPostPersist(Location ob) {
		//System.out.println("Listening User Post Persist : " + ob.toString());
		//AutowireHelper.autowire(this, this.template);
		//Date time=new Date();
		/*template.convertAndSend("/topic/greetings", new Greeting(time.toString()+"Hello psim tester, " +"1111" + "!"));*/
		//template.convertAndSend("/topic/greetings", ob);
	}
	@PostLoad
	public void userPostLoad(Location ob) {
	}	
	@PreUpdate
	public void userPreUpdate(Location ob) {
	}
	@PostUpdate
	public void userPostUpdate(Location ob) {
	}
	@PreRemove
	public void userPreRemove(Location ob) {
	}
	@PostRemove
	public void userPostRemove(Location ob) {
	}

}
