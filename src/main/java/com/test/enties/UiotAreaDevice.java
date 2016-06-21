package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the uiot_area_device database table.
 * 
 */
@Entity
@Table(name="uiot_area_device")
@NamedQuery(name="UiotAreaDevice.findAll", query="SELECT u FROM UiotAreaDevice u")
public class UiotAreaDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UiotAreaDevicePK id;

	@Column(name="create_time")
	private Timestamp createTime;

	private byte isvalid;

	//bi-directional many-to-one association to UiotArea
	@ManyToOne
	@JoinColumn(name="area_id")
	private UiotArea uiotArea;

	//bi-directional many-to-one association to UiotDeviceLib
	@ManyToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	public UiotAreaDevice() {
	}

	public UiotAreaDevicePK getId() {
		return this.id;
	}

	public void setId(UiotAreaDevicePK id) {
		this.id = id;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public byte getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(byte isvalid) {
		this.isvalid = isvalid;
	}

	public UiotArea getUiotArea() {
		return this.uiotArea;
	}

	public void setUiotArea(UiotArea uiotArea) {
		this.uiotArea = uiotArea;
	}

	public UiotDeviceLib getUiotDeviceLib() {
		return this.uiotDeviceLib;
	}

	public void setUiotDeviceLib(UiotDeviceLib uiotDeviceLib) {
		this.uiotDeviceLib = uiotDeviceLib;
	}

}