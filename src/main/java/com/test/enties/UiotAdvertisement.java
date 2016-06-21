package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_advertisement database table.
 * 
 */
@Entity
@Table(name="uiot_advertisement")
@NamedQuery(name="UiotAdvertisement.findAll", query="SELECT u FROM UiotAdvertisement u")
public class UiotAdvertisement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="adv_id")
	private String advId;

	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="display_order")
	private byte displayOrder;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_time")
	private Date endTime;

	@Column(name="is_valid")
	private byte isValid;

	@Lob
	private String parameters;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="`start _time`")
	private Date start_Time;

	private String targets;

	private byte type;

	public UiotAdvertisement() {
	}

	public String getAdvId() {
		return this.advId;
	}

	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public byte getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(byte displayOrder) {
		this.displayOrder = displayOrder;
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

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public Date getStart_Time() {
		return this.start_Time;
	}

	public void setStart_Time(Date start_Time) {
		this.start_Time = start_Time;
	}

	public String getTargets() {
		return this.targets;
	}

	public void setTargets(String targets) {
		this.targets = targets;
	}

	public byte getType() {
		return this.type;
	}

	public void setType(byte type) {
		this.type = type;
	}

}