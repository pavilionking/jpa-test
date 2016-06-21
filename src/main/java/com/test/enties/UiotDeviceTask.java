package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the uiot_device_task database table.
 * 
 */
@Entity
@Table(name="uiot_device_task")
@NamedQuery(name="UiotDeviceTask.findAll", query="SELECT u FROM UiotDeviceTask u")
public class UiotDeviceTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="task_id")
	private String taskId;

	@Column(name="create_time")
	private Timestamp createTime;

	private String cycle;

	@Column(name="device_status_data")
	private String deviceStatusData;

	private byte operation;

	@Column(name="task_status")
	private byte taskStatus;

	@Column(name="trigger_time")
	private Time triggerTime;

	//bi-directional many-to-one association to UiotDeviceLib
	@ManyToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	public UiotDeviceTask() {
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getDeviceStatusData() {
		return this.deviceStatusData;
	}

	public void setDeviceStatusData(String deviceStatusData) {
		this.deviceStatusData = deviceStatusData;
	}

	public byte getOperation() {
		return this.operation;
	}

	public void setOperation(byte operation) {
		this.operation = operation;
	}

	public byte getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(byte taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Time getTriggerTime() {
		return this.triggerTime;
	}

	public void setTriggerTime(Time triggerTime) {
		this.triggerTime = triggerTime;
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