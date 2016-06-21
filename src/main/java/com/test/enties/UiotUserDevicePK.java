package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uiot_user_device database table.
 * 
 */
@Embeddable
public class UiotUserDevicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id", insertable=false, updatable=false)
	private String userId;

	@Column(name="device_id", insertable=false, updatable=false)
	private String deviceId;

	public UiotUserDevicePK() {
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UiotUserDevicePK)) {
			return false;
		}
		UiotUserDevicePK castOther = (UiotUserDevicePK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.deviceId.equals(castOther.deviceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.deviceId.hashCode();
		
		return hash;
	}
}