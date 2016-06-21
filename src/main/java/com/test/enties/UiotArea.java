package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the uiot_area database table.
 * 
 */
@Entity
@Table(name="uiot_area")
@NamedQuery(name="UiotArea.findAll", query="SELECT u FROM UiotArea u")
public class UiotArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="area_id")
	private String areaId;

	@Column(name="area_name")
	private String areaName;

	@Column(name="create_time")
	private Timestamp createTime;

	private byte isvalid;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	//bi-directional many-to-one association to UiotAreaDevice
	@OneToMany(mappedBy="uiotArea")
	private List<UiotAreaDevice> uiotAreaDevices;

	public UiotArea() {
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
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

	public UiotUser getUiotUser() {
		return this.uiotUser;
	}

	public void setUiotUser(UiotUser uiotUser) {
		this.uiotUser = uiotUser;
	}

	public List<UiotAreaDevice> getUiotAreaDevices() {
		return this.uiotAreaDevices;
	}

	public void setUiotAreaDevices(List<UiotAreaDevice> uiotAreaDevices) {
		this.uiotAreaDevices = uiotAreaDevices;
	}

	public UiotAreaDevice addUiotAreaDevice(UiotAreaDevice uiotAreaDevice) {
		getUiotAreaDevices().add(uiotAreaDevice);
		uiotAreaDevice.setUiotArea(this);

		return uiotAreaDevice;
	}

	public UiotAreaDevice removeUiotAreaDevice(UiotAreaDevice uiotAreaDevice) {
		getUiotAreaDevices().remove(uiotAreaDevice);
		uiotAreaDevice.setUiotArea(null);

		return uiotAreaDevice;
	}

}