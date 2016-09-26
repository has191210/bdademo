package com.bigdatarchitect.bdash.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class PermissionPolicyUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Oid;
	private String StoredPassword;
	private boolean ChangePasswordOnFirstLogon;
	private String  UserName;
	private boolean IsActive;
	private int OptimisticLockField;
	private int GCRecord;
	public int getOid() {
		return Oid;
	}
	public void setOid(int oid) {
		Oid = oid;
	}
	public String getStoredPassword() {
		return StoredPassword;
	}
	public void setStoredPassword(String storedPassword) {
		StoredPassword = storedPassword;
	}
	public boolean isChangePasswordOnFirstLogon() {
		return ChangePasswordOnFirstLogon;
	}
	public void setChangePasswordOnFirstLogon(boolean changePasswordOnFirstLogon) {
		ChangePasswordOnFirstLogon = changePasswordOnFirstLogon;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public int getOptimisticLockField() {
		return OptimisticLockField;
	}
	public void setOptimisticLockField(int optimisticLockField) {
		OptimisticLockField = optimisticLockField;
	}
	public int getGCRecord() {
		return GCRecord;
	}
	public void setGCRecord(int gCRecord) {
		GCRecord = gCRecord;
	}
	
	

}
