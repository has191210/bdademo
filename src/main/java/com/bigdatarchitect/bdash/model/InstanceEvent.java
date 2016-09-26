package com.bigdatarchitect.bdash.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import com.bigdatarchitect.bdash.entitylistener.InstanceEventListener;

@Entity
@EntityListeners(InstanceEventListener.class)
@Table(name="instance_event")
public class InstanceEvent {
	    @javax.persistence.Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="\"OID\"")
	    private int OID;
	    private String Description;
	    private Date LogTimestamp;
	    private int InstanceEventType;
	    private int Location;
	    private int Guard;
//	    @Column(name="\"OptimisticLockField\"", columnDefinition = "int default null")
//	    private int OptimisticLockField;
//		@Column(name="\"GCRecord\"", columnDefinition = "int default null")
//	    private int GCRecord;
	    private long Duration;
	    private byte[] Photo;
		public int getOID() {
			return OID;
		}
		public void setOID(int oID) {
			OID = oID;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public Date getLogTimestamp() {
			return LogTimestamp;
		}
		public void setLogTimestamp(Date logTimestamp) {
			LogTimestamp = logTimestamp;
		}
		public int getInstanceEventType() {
			return InstanceEventType;
		}
		public void setInstanceEventType(int instanceEventType) {
			InstanceEventType = instanceEventType;
		}
		public int getLocation() {
			return Location;
		}
		public void setLocation(int location) {
			Location = location;
		}
		public int getGuard() {
			return Guard;
		}
		public void setGuard(int guard) {
			Guard = guard;
		}
//		public int getOptimisticLockField() {
//			return OptimisticLockField;
//		}
//		public void setOptimisticLockField(int optimisticLockField) {
//			OptimisticLockField = optimisticLockField;
//		}
//		public int getGCRecord() {
//			return GCRecord;
//		}
//		public void setGCRecord(int gCRecord) {
//			GCRecord = gCRecord;
//		}
		public long getDuration() {
			return Duration;
		}
		public void setDuration(long duration) {
			Duration = duration;
		}
		public byte[] getPhoto() {
			return Photo;
		}
		public void setPhoto(byte[] photo) {
			Photo = photo;
		}
		@Override
		public String toString() {
			return "InstanceEvent [OID=" + OID + ", Description=" + Description + ", LogTimestamp=" + LogTimestamp
					+ ", InstanceEventType=" + InstanceEventType + ", Location=" + Location + ", Guard=" + Guard
					+ ", Duration="
					+ Duration + "]";
		}
				
}