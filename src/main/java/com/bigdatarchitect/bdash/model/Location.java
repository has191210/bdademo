package com.bigdatarchitect.bdash.model;

import javax.persistence.*;

import com.bigdatarchitect.bdash.entitylistener.LocationListener;

@Entity
@EntityListeners(LocationListener.class)
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="\"OID\"")
	private int OID;
    private String Name;
    private float Longitude;
    private float Latitude;
    private String Remark;

    public int getID() {
		return OID;
	}

	public void setID(int id) {
		OID = id;
	}

	public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }
    
    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

	public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

}
