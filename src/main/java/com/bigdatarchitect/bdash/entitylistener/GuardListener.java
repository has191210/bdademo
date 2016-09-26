package com.bigdatarchitect.bdash.entitylistener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.bigdatarchitect.bdash.model.Guard;

public class GuardListener {
	@PrePersist
	public void userPrePersist(Guard ob) {
		System.out.println("Listening User Pre Persist : " + ob.getFirstName());
	}
	@PostPersist
	public void userPostPersist(Guard ob) {
		System.out.println("Listening User Post Persist : " + ob.getFirstName());
	}
	@PostLoad
	public void userPostLoad(Guard ob) {
		System.out.println("Listening User Post Load : " + ob.getFirstName());
	}	
	@PreUpdate
	public void userPreUpdate(Guard ob) {
		System.out.println("Listening User Pre Update : " + ob.getFirstName());
	}
	@PostUpdate
	public void userPostUpdate(Guard ob) {
		System.out.println("Listening User Post Update : " + ob.getFirstName());
	}
	@PreRemove
	public void userPreRemove(Guard ob) {
		System.out.println("Listening User Pre Remove : " + ob.getFirstName());
	}
	@PostRemove
	public void userPostRemove(Guard ob) {
		System.out.println("Listening User Post Remove : " + ob.getFirstName());
	}

}
