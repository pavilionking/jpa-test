package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_device_rom database table.
 * 
 */
@Entity
@Table(name="uiot_device_rom")
@NamedQuery(name="UiotDeviceRom.findAll", query="SELECT u FROM UiotDeviceRom u")
public class UiotDeviceRom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="device_rom_id")
	private String deviceRomId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="file_name")
	private String fileName;

	@Column(name="file_path")
	private String filePath;

	@Column(name="rom_version")
	private String romVersion;

	@Column(name="rom_version_code")
	private String romVersionCode;

	@Column(name="rom_version_num")
	private int romVersionNum;

	@Lob
	@Column(name="update_msg")
	private String updateMsg;

	@Column(name="upgrade_policy")
	private byte upgradePolicy;

	public UiotDeviceRom() {
	}

	public String getDeviceRomId() {
		return this.deviceRomId;
	}

	public void setDeviceRomId(String deviceRomId) {
		this.deviceRomId = deviceRomId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getRomVersion() {
		return this.romVersion;
	}

	public void setRomVersion(String romVersion) {
		this.romVersion = romVersion;
	}

	public String getRomVersionCode() {
		return this.romVersionCode;
	}

	public void setRomVersionCode(String romVersionCode) {
		this.romVersionCode = romVersionCode;
	}

	public int getRomVersionNum() {
		return this.romVersionNum;
	}

	public void setRomVersionNum(int romVersionNum) {
		this.romVersionNum = romVersionNum;
	}

	public String getUpdateMsg() {
		return this.updateMsg;
	}

	public void setUpdateMsg(String updateMsg) {
		this.updateMsg = updateMsg;
	}

	public byte getUpgradePolicy() {
		return this.upgradePolicy;
	}

	public void setUpgradePolicy(byte upgradePolicy) {
		this.upgradePolicy = upgradePolicy;
	}

}