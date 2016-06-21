package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the uiot_scene_device database table.
 * 
 */
@Embeddable
public class UiotSceneDevicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="scene_id", insertable=false, updatable=false)
	private String sceneId;

	@Column(name="device_id", insertable=false, updatable=false)
	private String deviceId;

	public UiotSceneDevicePK() {
	}
	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
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
		if (!(other instanceof UiotSceneDevicePK)) {
			return false;
		}
		UiotSceneDevicePK castOther = (UiotSceneDevicePK)other;
		return 
			this.sceneId.equals(castOther.sceneId)
			&& this.deviceId.equals(castOther.deviceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sceneId.hashCode();
		hash = hash * prime + this.deviceId.hashCode();
		
		return hash;
	}
}