package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_token database table.
 * 
 */
@Entity
@Table(name="uiot_token")
@NamedQuery(name="UiotToken.findAll", query="SELECT u FROM UiotToken u")
public class UiotToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="token_id")
	private int tokenId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="device_id")
	private String deviceId;

	private String token;

	@Column(name="token_type")
	private byte tokenType;

	@Column(name="user_id")
	private String userId;

	public UiotToken() {
	}

	public int getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public byte getTokenType() {
		return this.tokenType;
	}

	public void setTokenType(byte tokenType) {
		this.tokenType = tokenType;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}