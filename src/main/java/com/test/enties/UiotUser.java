package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the uiot_user database table.
 * 
 */
@Entity
@Table(name="uiot_user")
@NamedQuery(name="UiotUser.findAll", query="SELECT u FROM UiotUser u")
public class UiotUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="app_key")
	private String appKey;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String password;

	@Column(name="user_type")
	private byte userType;

	private String username;

	//bi-directional many-to-one association to UiotArea
	@OneToMany(mappedBy="uiotUser")
	private List<UiotArea> uiotAreas;

	//bi-directional many-to-one association to UiotDeviceLog
	@OneToMany(mappedBy="uiotUser")
	private List<UiotDeviceLog> uiotDeviceLogs;

	//bi-directional many-to-one association to UiotDeviceSubUser
	@OneToMany(mappedBy="uiotUser")
	private List<UiotDeviceSubUser> uiotDeviceSubUsers;

	//bi-directional many-to-one association to UiotDeviceTask
	@OneToMany(mappedBy="uiotUser")
	private List<UiotDeviceTask> uiotDeviceTasks;

	//bi-directional many-to-one association to UiotFeedback
	@OneToMany(mappedBy="uiotUser")
	private List<UiotFeedback> uiotFeedbacks;

	//bi-directional many-to-one association to UiotScene
	@OneToMany(mappedBy="uiotUser")
	private List<UiotScene> uiotScenes;

	//bi-directional many-to-one association to UiotUserDevice
	@OneToMany(mappedBy="uiotUser")
	private List<UiotUserDevice> uiotUserDevices;

	//bi-directional one-to-one association to UiotUserInfo
	@OneToOne(mappedBy="uiotUser")
	private UiotUserInfo uiotUserInfo;

	public UiotUser() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte getUserType() {
		return this.userType;
	}

	public void setUserType(byte userType) {
		this.userType = userType;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<UiotArea> getUiotAreas() {
		return this.uiotAreas;
	}

	public void setUiotAreas(List<UiotArea> uiotAreas) {
		this.uiotAreas = uiotAreas;
	}

	public UiotArea addUiotArea(UiotArea uiotArea) {
		getUiotAreas().add(uiotArea);
		uiotArea.setUiotUser(this);

		return uiotArea;
	}

	public UiotArea removeUiotArea(UiotArea uiotArea) {
		getUiotAreas().remove(uiotArea);
		uiotArea.setUiotUser(null);

		return uiotArea;
	}

	public List<UiotDeviceLog> getUiotDeviceLogs() {
		return this.uiotDeviceLogs;
	}

	public void setUiotDeviceLogs(List<UiotDeviceLog> uiotDeviceLogs) {
		this.uiotDeviceLogs = uiotDeviceLogs;
	}

	public UiotDeviceLog addUiotDeviceLog(UiotDeviceLog uiotDeviceLog) {
		getUiotDeviceLogs().add(uiotDeviceLog);
		uiotDeviceLog.setUiotUser(this);

		return uiotDeviceLog;
	}

	public UiotDeviceLog removeUiotDeviceLog(UiotDeviceLog uiotDeviceLog) {
		getUiotDeviceLogs().remove(uiotDeviceLog);
		uiotDeviceLog.setUiotUser(null);

		return uiotDeviceLog;
	}

	public List<UiotDeviceSubUser> getUiotDeviceSubUsers() {
		return this.uiotDeviceSubUsers;
	}

	public void setUiotDeviceSubUsers(List<UiotDeviceSubUser> uiotDeviceSubUsers) {
		this.uiotDeviceSubUsers = uiotDeviceSubUsers;
	}

	public UiotDeviceSubUser addUiotDeviceSubUser(UiotDeviceSubUser uiotDeviceSubUser) {
		getUiotDeviceSubUsers().add(uiotDeviceSubUser);
		uiotDeviceSubUser.setUiotUser(this);

		return uiotDeviceSubUser;
	}

	public UiotDeviceSubUser removeUiotDeviceSubUser(UiotDeviceSubUser uiotDeviceSubUser) {
		getUiotDeviceSubUsers().remove(uiotDeviceSubUser);
		uiotDeviceSubUser.setUiotUser(null);

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
		uiotDeviceTask.setUiotUser(this);

		return uiotDeviceTask;
	}

	public UiotDeviceTask removeUiotDeviceTask(UiotDeviceTask uiotDeviceTask) {
		getUiotDeviceTasks().remove(uiotDeviceTask);
		uiotDeviceTask.setUiotUser(null);

		return uiotDeviceTask;
	}

	public List<UiotFeedback> getUiotFeedbacks() {
		return this.uiotFeedbacks;
	}

	public void setUiotFeedbacks(List<UiotFeedback> uiotFeedbacks) {
		this.uiotFeedbacks = uiotFeedbacks;
	}

	public UiotFeedback addUiotFeedback(UiotFeedback uiotFeedback) {
		getUiotFeedbacks().add(uiotFeedback);
		uiotFeedback.setUiotUser(this);

		return uiotFeedback;
	}

	public UiotFeedback removeUiotFeedback(UiotFeedback uiotFeedback) {
		getUiotFeedbacks().remove(uiotFeedback);
		uiotFeedback.setUiotUser(null);

		return uiotFeedback;
	}

	public List<UiotScene> getUiotScenes() {
		return this.uiotScenes;
	}

	public void setUiotScenes(List<UiotScene> uiotScenes) {
		this.uiotScenes = uiotScenes;
	}

	public UiotScene addUiotScene(UiotScene uiotScene) {
		getUiotScenes().add(uiotScene);
		uiotScene.setUiotUser(this);

		return uiotScene;
	}

	public UiotScene removeUiotScene(UiotScene uiotScene) {
		getUiotScenes().remove(uiotScene);
		uiotScene.setUiotUser(null);

		return uiotScene;
	}

	public List<UiotUserDevice> getUiotUserDevices() {
		return this.uiotUserDevices;
	}

	public void setUiotUserDevices(List<UiotUserDevice> uiotUserDevices) {
		this.uiotUserDevices = uiotUserDevices;
	}

	public UiotUserDevice addUiotUserDevice(UiotUserDevice uiotUserDevice) {
		getUiotUserDevices().add(uiotUserDevice);
		uiotUserDevice.setUiotUser(this);

		return uiotUserDevice;
	}

	public UiotUserDevice removeUiotUserDevice(UiotUserDevice uiotUserDevice) {
		getUiotUserDevices().remove(uiotUserDevice);
		uiotUserDevice.setUiotUser(null);

		return uiotUserDevice;
	}

	public UiotUserInfo getUiotUserInfo() {
		return this.uiotUserInfo;
	}

	public void setUiotUserInfo(UiotUserInfo uiotUserInfo) {
		this.uiotUserInfo = uiotUserInfo;
	}

}