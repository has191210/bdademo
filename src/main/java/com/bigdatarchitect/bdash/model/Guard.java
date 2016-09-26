package com.bigdatarchitect.bdash.model;

import javax.persistence.*;

import com.bigdatarchitect.bdash.entitylistener.GuardListener;

@Entity
@EntityListeners(GuardListener.class)
public class Guard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="\"OID\"")
	private long id;

    @Version
    private Integer version;
    private String firstName;
    private String lastName;

    private String staffId;

    private String loginId;
    private String loginPassword;

    private byte[] photo;

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
    
    

}
