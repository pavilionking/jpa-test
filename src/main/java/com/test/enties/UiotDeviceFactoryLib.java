package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_device_factory_lib database table.
 * 
 */
@Entity
@Table(name="uiot_device_factory_lib")
@NamedQuery(name="UiotDeviceFactoryLib.findAll", query="SELECT u FROM UiotDeviceFactoryLib u")
public class UiotDeviceFactoryLib implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="chip_id")
	private String chipId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="device_type")
	private int deviceType;

	@Column(name="device_version")
	private String deviceVersion;

	@Column(name="factory_code")
	private String factoryCode;

	@Column(name="leave_factory_date")
	private String leaveFactoryDate;

	@Column(name="product_batch")
	private String productBatch;

	@Column(name="product_serial_num")
	private String productSerialNum;

	//bi-directional many-to-one association to UiotProduct
	@ManyToOne
	@JoinColumn(name="product_id")
	private UiotProduct uiotProduct;

	public UiotDeviceFactoryLib() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(int deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}

	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
	}

	public String getFactoryCode() {
		return this.factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getLeaveFactoryDate() {
		return this.leaveFactoryDate;
	}

	public void setLeaveFactoryDate(String leaveFactoryDate) {
		this.leaveFactoryDate = leaveFactoryDate;
	}

	public String getProductBatch() {
		return this.productBatch;
	}

	public void setProductBatch(String productBatch) {
		this.productBatch = productBatch;
	}

	public String getProductSerialNum() {
		return this.productSerialNum;
	}

	public void setProductSerialNum(String productSerialNum) {
		this.productSerialNum = productSerialNum;
	}

	public UiotProduct getUiotProduct() {
		return this.uiotProduct;
	}

	public void setUiotProduct(UiotProduct uiotProduct) {
		this.uiotProduct = uiotProduct;
	}

}