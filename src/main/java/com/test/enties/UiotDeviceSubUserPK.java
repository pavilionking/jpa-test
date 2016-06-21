package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uiot_device_sub_user database table.
 * 
 */
@Embeddable
public class UiotDeviceSubUserPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="device_id", insertable=false, updatable=false)
	private String deviceId;

	@Column(name="user_id", insertable=false, updatable=false)
	private String userId;

	public UiotDeviceSubUserPK() {
	}
	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UiotDeviceSubUserPK)) {
			return false;
		}
		UiotDeviceSubUserPK castOther = (UiotDeviceSubUserPK)other;
		return 
			this.deviceId.equals(castOther.deviceId)
			&& this.userId.equals(castOther.userId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.deviceId.hashCode();
		hash = hash * prime + this.userId.hashCode();
		
		return hash;
	}
}