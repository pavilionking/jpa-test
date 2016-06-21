package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the uiot_device_lib database table.
 * 
 */
@Entity
@Table(name="uiot_device_lib")
@NamedQuery(name="UiotDeviceLib.findAll", query="SELECT u FROM UiotDeviceLib u")
public class UiotDeviceLib implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="device_id")
	private String deviceId;

	@Column(name="activation_code")
	private String activationCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="actived_time")
	private Date activedTime;

	@Column(name="chip_id")
	private String chipId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="is_actived")
	private byte isActived;

	@Column(name="mac_address")
	private String macAddress;

	@Column(name="rom_version")
	private String romVersion;

	@Column(name="rom_version_code")
	private String romVersionCode;

	//bi-directional many-to-one association to UiotAreaDevice
	@OneToMany(mappedBy="uiotDeviceLib")
	private List<UiotAreaDevice> uiotAreaDevices;

	//bi-directional many-to-one association to UiotProduct
	@ManyToOne
	@JoinColumn(name="product_id")
	private UiotProduct uiotProduct;

	//bi-directional many-to-one association to UiotDeviceLog
	@OneToMany(mappedBy="uiotDeviceLib")
	private List<UiotDeviceLog> uiotDeviceLogs;

	//bi-directional one-to-one association to UiotDeviceRealtime
	@OneToOne(mappedBy="uiotDeviceLib")
	private UiotDeviceRealtime uiotDeviceRealtime;

	//bi-directional many-to-one association to UiotDeviceSubUser
	@OneToMany(mappedBy="uiotDeviceLib")
	private List<UiotDeviceSubUser> uiotDeviceSubUsers;

	//bi-directional many-to-one association to UiotDeviceTask
	@OneToMany(mappedBy="uiotDeviceLib")
	private List<UiotDeviceTask> uiotDeviceTasks;

	//bi-directional many-to-one association to UiotSceneDevice
	@OneToMany(mappedBy="uiotDeviceLib")
	private List<UiotSceneDevice> uiotSceneDevices;

	//bi-directional many-to-one association to UiotUserDevice
	@OneToMany(mappedBy="uiotDeviceLib")
	private List<UiotUserDevice> uiotUserDevices;

	public UiotDeviceLib() {
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getActivationCode() {
		return this.activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public Date getActivedTime() {
		return this.activedTime;
	}

	public void setActivedTime(Date activedTime) {
		this.activedTime = activedTime;
	}

	public String getChipId() {
		return this.chipId;
	}

	public void setChipId(String chipId) {
		this.chipId = chipId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public byte getIsActived() {
		return this.isActived;
	}

	public void setIsActived(byte isActived) {
		this.isActived = isActived;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
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

	public List<UiotAreaDevice> getUiotAreaDevices() {
		return this.uiotAreaDevices;
	}

	public void setUiotAreaDevices(List<UiotAreaDevice> uiotAreaDevices) {
		this.uiotAreaDevices = uiotAreaDevices;
	}

	public UiotAreaDevice addUiotAreaDevice(UiotAreaDevice uiotAreaDevice) {
		getUiotAreaDevices().add(uiotAreaDevice);
		uiotAreaDevice.setUiotDeviceLib(this);

		return uiotAreaDevice;
	}

	public UiotAreaDevice removeUiotAreaDevice(UiotAreaDevice uiotAreaDevice) {
		getUiotAreaDevices().remove(uiotAreaDevice);
		uiotAreaDevice.setUiotDeviceLib(null);

		return uiotAreaDevice;
	}

	public UiotProduct getUiotProduct() {
		return this.uiotProduct;
	}

	public void setUiotProduct(UiotProduct uiotProduct) {
		this.uiotProduct = uiotProduct;
	}

	public List<UiotDeviceLog> getUiotDeviceLogs() {
		return this.uiotDeviceLogs;
	}

	public void setUiotDeviceLogs(List<UiotDeviceLog> uiotDeviceLogs) {
		this.uiotDeviceLogs = uiotDeviceLogs;
	}

	public UiotDeviceLog addUiotDeviceLog(UiotDeviceLog uiotDeviceLog) {
		getUiotDeviceLogs().add(uiotDeviceLog);
		uiotDeviceLog.setUiotDeviceLib(this);

		return uiotDeviceLog;
	}

	public UiotDeviceLog removeUiotDeviceLog(UiotDeviceLog uiotDeviceLog) {
		getUiotDeviceLogs().remove(uiotDeviceLog);
		uiotDeviceLog.setUiotDeviceLib(null);

		return uiotDeviceLog;
	}

	public UiotDeviceRealtime getUiotDeviceRealtime() {
		return this.uiotDeviceRealtime;
	}

	public void setUiotDeviceRealtime(UiotDeviceRealtime uiotDeviceRealtime) {
		this.uiotDeviceRealtime = uiotDeviceRealtime;
	}

	public List<UiotDeviceSubUser> getUiotDeviceSubUsers() {
		return this.uiotDeviceSubUsers;
	}

	public void setUiotDeviceSubUsers(List<UiotDeviceSubUser> uiotDeviceSubUsers) {
		this.uiotDeviceSubUsers = uiotDeviceSubUsers;
	}

	public UiotDeviceSubUser addUiotDeviceSubUser(UiotDeviceSubUser uiotDeviceSubUser) {
		getUiotDeviceSubUsers().add(uiotDeviceSubUser);
		uiotDeviceSubUser.setUiotDeviceLib(this);

		return uiotDeviceSubUser;
	}

	public UiotDeviceSubUser removeUiotDeviceSubUser(UiotDeviceSubUser uiotDeviceSubUser) {
		getUiotDeviceSubUsers().remove(uiotDeviceSubUser);
		uiotDeviceSubUser.setUiotDeviceLib(null);

		return uiotDeviceSubUser;
	}

	public List<UiotDeviceTask> getUiotDeviceTasks() {
		return this.uiotDeviceTasks;
	}

	public void setUiotDeviceTasks(List<UiotDeviceTask> uiotDeviceTasks) {
		this.uiotDeviceTasks = uiotDeviceTasks;
	}

	public UiotDeviceTask addUiotDeviceTask(UiotDeviceTask uiotDeviceTask) {
		getUiotDeviceTasks().add(uiotDeviceTask);
		uiotDeviceTask.setUiotDeviceLib(this);

		return uiotDeviceTask;
	}

	public UiotDeviceTask removeUiotDeviceTask(UiotDeviceTask uiotDeviceTask) {
		getUiotDeviceTasks().remove(uiotDeviceTask);
		uiotDeviceTask.setUiotDeviceLib(null);

		return uiotDeviceTask;
	}

	public List<UiotSceneDevice> getUiotSceneDevices() {
		return this.uiotSceneDevices;
	}

	public void setUiotSceneDevices(List<UiotSceneDevice> uiotSceneDevices) {
		this.uiotSceneDevices = uiotSceneDevices;
	}

	public UiotSceneDevice addUiotSceneDevice(UiotSceneDevice uiotSceneDevice) {
		getUiotSceneDevices().add(uiotSceneDevice);
		uiotSceneDevice.setUiotDeviceLib(this);

		return uiotSceneDevice;
	}

	public UiotSceneDevice removeUiotSceneDevice(UiotSceneDevice uiotSceneDevice) {
		getUiotSceneDevices().remove(uiotSceneDevice);
		uiotSceneDevice.setUiotDeviceLib(null);

		return uiotSceneDevice;
	}

	public List<UiotUserDevice> getUiotUserDevices() {
		return this.uiotUserDevices;
	}

	public void setUiotUserDevices(List<UiotUserDevice> uiotUserDevices) {
		this.uiotUserDevices = uiotUserDevices;
	}

	public UiotUserDevice addUiotUserDevice(UiotUserDevice uiotUserDevice) {
		getUiotUserDevices().add(uiotUserDevice);
		uiotUserDevice.setUiotDeviceLib(this);

		return uiotUserDevice;
	}

	public UiotUserDevice removeUiotUserDevice(UiotUserDevice uiotUserDevice) {
		getUiotUserDevices().remove(uiotUserDevice);
		uiotUserDevice.setUiotDeviceLib(null);

		return uiotUserDevice;
	}

}