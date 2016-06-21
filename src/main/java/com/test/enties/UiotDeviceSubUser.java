package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_device_sub_user database table.
 * 
 */
@Entity
@Table(name="uiot_device_sub_user")
@NamedQuery(name="UiotDeviceSubUser.findAll", query="SELECT u FROM UiotDeviceSubUser u")
public class UiotDeviceSubUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UiotDeviceSubUserPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private byte status;

	//bi-directional many-to-one association to UiotDeviceLib
	@ManyToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	public UiotDeviceSubUser() {
	}

	public UiotDeviceSubUserPK getId() {
		return this.id;
	}

	public void setId(UiotDeviceSubUserPK id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
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