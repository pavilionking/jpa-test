package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_device_log database table.
 * 
 */
@Entity
@Table(name="uiot_device_log")
@NamedQuery(name="UiotDeviceLog.findAll", query="SELECT u FROM UiotDeviceLog u")
public class UiotDeviceLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="device_log_id")
	private String deviceLogId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Lob
	@Column(name="log_message")
	private String logMessage;

	@Column(name="log_type")
	private byte logType;

	//bi-directional many-to-one association to UiotDeviceLib
	@ManyToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	//bi-directional many-to-one association to UiotProduct
	@ManyToOne
	@JoinColumn(name="product_id")
	private UiotProduct uiotProduct;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	public UiotDeviceLog() {
	}

	public String getDeviceLogId() {
		return this.deviceLogId;
	}

	public void setDeviceLogId(String deviceLogId) {
		this.deviceLogId = deviceLogId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLogMessage() {
		return this.logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	public byte getLogType() {
		return this.logType;
	}

	public void setLogType(byte logType) {
		this.logType = logType;
	}

	public UiotDeviceLib getUiotDeviceLib() {
		return this.uiotDeviceLib;
	}

	public void setUiotDeviceLib(UiotDeviceLib uiotDeviceLib) {
		this.uiotDeviceLib = uiotDeviceLib;
	}

	public UiotProduct getUiotProduct() {
		return this.uiotProduct;
	}

	public void setUiotProduct(UiotProduct uiotProduct) {
		this.uiotProduct = uiotProduct;
	}

	public UiotUser getUiotUser() {
		return this.uiotUser;
	}

	public void setUiotUser(UiotUser uiotUser) {
		this.uiotUser = uiotUser;
	}

}