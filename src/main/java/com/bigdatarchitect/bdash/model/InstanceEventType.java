package com.bigdatarchitect.bdash.model;

import javax.persistence.*;

import com.bigdatarchitect.bdash.entitylistener.InstanceEventTypeListener;

@Entity
@EntityListeners(InstanceEventTypeListener.class)
@Table(name="instance_event_type")
public class InstanceEventType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="\"OID\"")
	private int ID;
    private String Name;
    private int Level;

    public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

}
