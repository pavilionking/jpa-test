package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_enterprise_info database table.
 * 
 */
@Entity
@Table(name="uiot_enterprise_info")
@NamedQuery(name="UiotEnterpriseInfo.findAll", query="SELECT u FROM UiotEnterpriseInfo u")
public class UiotEnterpriseInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="enter_id")
	private String enterId;

	private String address;

	private String contacts;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String name;

	@Column(name="phone_number")
	private String phoneNumber;

	public UiotEnterpriseInfo() {
	}

	public String getEnterId() {
		return this.enterId;
	}

	public void setEnterId(String enterId) {
		this.enterId = enterId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}