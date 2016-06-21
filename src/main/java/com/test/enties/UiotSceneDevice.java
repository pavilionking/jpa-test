package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the uiot_scene_device database table.
 * 
 */
@Entity
@Table(name="uiot_scene_device")
@NamedQuery(name="UiotSceneDevice.findAll", query="SELECT u FROM UiotSceneDevice u")
public class UiotSceneDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UiotSceneDevicePK id;

	@Column(name="create_time")
	private Timestamp createTime;

	@Lob
	@Column(name="device_status_data")
	private String deviceStatusData;

	private byte isvalid;

	//bi-directional many-to-one association to UiotDeviceLib
	@ManyToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	//bi-directional many-to-one association to UiotScene
	@ManyToOne
	@JoinColumn(name="scene_id")
	private UiotScene uiotScene;

	public UiotSceneDevice() {
	}

	public UiotSceneDevicePK getId() {
		return this.id;
	}

	public void setId(UiotSceneDevicePK id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDeviceStatusData() {
		return this.deviceStatusData;
	}

	public void setDeviceStatusData(String deviceStatusData) {
		this.deviceStatusData = deviceStatusData;
	}

	public byte getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(byte isvalid) {
		this.isvalid = isvalid;
	}

	public UiotDeviceLib getUiotDeviceLib() {
		return this.uiotDeviceLib;
	}

	public void setUiotDeviceLib(UiotDeviceLib uiotDeviceLib) {
		this.uiotDeviceLib = uiotDeviceLib;
	}

	public UiotScene getUiotScene() {
		return this.uiotScene;
	}

	public void setUiotScene(UiotScene uiotScene) {
		this.uiotScene = uiotScene;
	}

}