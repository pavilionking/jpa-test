package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_login_failed database table.
 * 
 */
@Entity
@Table(name="uiot_login_failed")
@NamedQuery(name="UiotLoginFailed.findAll", query="SELECT u FROM UiotLoginFailed u")
public class UiotLoginFailed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="login_failed_id")
	private String loginFailedId;

	private byte count;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login_time")
	private Date lastLoginTime;

	private String username;

	public UiotLoginFailed() {
	}

	public String getLoginFailedId() {
		return this.loginFailedId;
	}

	public void setLoginFailedId(String loginFailedId) {
		this.loginFailedId = loginFailedId;
	}

	public byte getCount() {
		return this.count;
	}

	public void setCount(byte count) {
		this.count = count;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}