package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uiot_area_device database table.
 * 
 */
@Embeddable
public class UiotAreaDevicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="device_id", insertable=false, updatable=false)
	private String deviceId;

	@Column(name="area_id", insertable=false, updatable=false)
	private String areaId;

	public UiotAreaDevicePK() {
	}
	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getAreaId() {
		return this.areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UiotAreaDevicePK)) {
			return false;
		}
		UiotAreaDevicePK castOther = (UiotAreaDevicePK)other;
		return 
			this.deviceId.equals(castOther.deviceId)
			&& this.areaId.equals(castOther.areaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.deviceId.hashCode();
		hash = hash * prime + this.areaId.hashCode();
		
		return hash;
	}
}