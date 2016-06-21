package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_qr_code database table.
 * 
 */
@Entity
@Table(name="uiot_qr_code")
@NamedQuery(name="UiotQrCode.findAll", query="SELECT u FROM UiotQrCode u")
public class UiotQrCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="qr_corde_id")
	private String qrCordeId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="is_valid")
	private byte isValid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_time")
	private Date startTime;

	private byte type;

	@Column(name="user_id")
	private String userId;

	public UiotQrCode() {
	}

	public String getQrCordeId() {
		return this.qrCordeId;
	}

	public void setQrCordeId(String qrCordeId) {
		this.qrCordeId = qrCordeId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public byte getIsValid() {
		return this.isValid;
	}

	public void setIsValid(byte isValid) {
		this.isValid = isValid;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}