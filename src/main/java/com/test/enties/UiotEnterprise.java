package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_enterprise database table.
 * 
 */
@Entity
@Table(name="uiot_enterprise")
@NamedQuery(name="UiotEnterprise.findAll", query="SELECT u FROM UiotEnterprise u")
public class UiotEnterprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="enter_id")
	private String enterId;

	private String account;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String password;

	public UiotEnterprise() {
	}

	public String getEnterId() {
		return this.enterId;
	}

	public void setEnterId(String enterId) {
		this.enterId = enterId;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}