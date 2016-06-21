package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_mobile_app database table.
 * 
 */
@Entity
@Table(name="uiot_mobile_app")
@NamedQuery(name="UiotMobileApp.findAll", query="SELECT u FROM UiotMobileApp u")
public class UiotMobileApp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mobile_app_id")
	private String mobileAppId;

	@Column(name="app_name")
	private String appName;

	@Column(name="app_version")
	private String appVersion;

	@Column(name="app_version_code")
	private String appVersionCode;

	@Column(name="app_version_num")
	private int appVersionNum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="file_name")
	private String fileName;

	@Column(name="file_path")
	private String filePath;

	@Lob
	@Column(name="update_msg")
	private String updateMsg;

	public UiotMobileApp() {
	}

	public String getMobileAppId() {
		return this.mobileAppId;
	}

	public void setMobileAppId(String mobileAppId) {
		this.mobileAppId = mobileAppId;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppVersionCode() {
		return this.appVersionCode;
	}

	public void setAppVersionCode(String appVersionCode) {
		this.appVersionCode = appVersionCode;
	}

	public int getAppVersionNum() {
		return this.appVersionNum;
	}

	public void setAppVersionNum(int appVersionNum) {
		this.appVersionNum = appVersionNum;
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

	public String getUpdateMsg() {
		return this.updateMsg;
	}

	public void setUpdateMsg(String updateMsg) {
		this.updateMsg = updateMsg;
	}

}