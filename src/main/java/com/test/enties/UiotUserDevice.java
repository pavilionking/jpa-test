package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_user_device database table.
 * 
 */
@Entity
@Table(name="uiot_user_device")
@NamedQuery(name="UiotUserDevice.findAll", query="SELECT u FROM UiotUserDevice u")
public class UiotUserDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UiotUserDevicePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="device_name")
	private String deviceName;

	@Column(name="is_owner")
	private byte isOwner;

	//bi-directional many-to-one association to UiotDeviceLib
	@ManyToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	public UiotUserDevice() {
	}

	public UiotUserDevicePK getId() {
		return this.id;
	}

	public void setId(UiotUserDevicePK id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public byte getIsOwner() {
		return this.isOwner;
	}

	public void setIsOwner(byte isOwner) {
		this.isOwner = isOwner;
	}

	public UiotDeviceLib getUiotDeviceLib() {
		return this.uiotDeviceLib;
	}

	public void setUiotDeviceLib(UiotDeviceLib uiotDeviceLib) {
		this.uiotDeviceLib = uiotDeviceLib;
	}

	public UiotUser getUiotUser() {
		return this.uiotUser;
	}

	public void setUiotUser(UiotUser uiotUser) {
		this.uiotUser = uiotUser;
	}

}