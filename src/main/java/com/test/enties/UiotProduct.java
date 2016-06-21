package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the uiot_product database table.
 * 
 */
@Entity
@Table(name="uiot_product")
@NamedQuery(name="UiotProduct.findAll", query="SELECT u FROM UiotProduct u")
public class UiotProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id")
	private String productId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="enter_id")
	private String enterId;

	@Column(name="product_code")
	private String productCode;

	@Column(name="product_key")
	private String productKey;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_type")
	private byte productType;

	//bi-directional many-to-one association to UiotDeviceFactoryLib
	@OneToMany(mappedBy="uiotProduct")
	private List<UiotDeviceFactoryLib> uiotDeviceFactoryLibs;

	//bi-directional many-to-one association to UiotDeviceLib
	@OneToMany(mappedBy="uiotProduct")
	private List<UiotDeviceLib> uiotDeviceLibs;

	//bi-directional many-to-one association to UiotDeviceLog
	@OneToMany(mappedBy="uiotProduct")
	private List<UiotDeviceLog> uiotDeviceLogs;

	//bi-directional many-to-one association to UiotDeviceRealtime
	@OneToMany(mappedBy="uiotProduct")
	private List<UiotDeviceRealtime> uiotDeviceRealtimes;

	public UiotProduct() {
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEnterId() {
		return this.enterId;
	}

	public void setEnterId(String enterId) {
		this.enterId = enterId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public byte getProductType() {
		return this.productType;
	}

	public void setProductType(byte productType) {
		this.productType = productType;
	}

	public List<UiotDeviceFactoryLib> getUiotDeviceFactoryLibs() {
		return this.uiotDeviceFactoryLibs;
	}

	public void setUiotDeviceFactoryLibs(List<UiotDeviceFactoryLib> uiotDeviceFactoryLibs) {
		this.uiotDeviceFactoryLibs = uiotDeviceFactoryLibs;
	}

	public UiotDeviceFactoryLib addUiotDeviceFactoryLib(UiotDeviceFactoryLib uiotDeviceFactoryLib) {
		getUiotDeviceFactoryLibs().add(uiotDeviceFactoryLib);
		uiotDeviceFactoryLib.setUiotProduct(this);

		return uiotDeviceFactoryLib;
	}

	public UiotDeviceFactoryLib removeUiotDeviceFactoryLib(UiotDeviceFactoryLib uiotDeviceFactoryLib) {
		getUiotDeviceFactoryLibs().remove(uiotDeviceFactoryLib);
		uiotDeviceFactoryLib.setUiotProduct(null);

		return uiotDeviceFactoryLib;
	}

	public List<UiotDeviceLib> getUiotDeviceLibs() {
		return this.uiotDeviceLibs;
	}

	public void setUiotDeviceLibs(List<UiotDeviceLib> uiotDeviceLibs) {
		this.uiotDeviceLibs = uiotDeviceLibs;
	}

	public UiotDeviceLib addUiotDeviceLib(UiotDeviceLib uiotDeviceLib) {
		getUiotDeviceLibs().add(uiotDeviceLib);
		uiotDeviceLib.setUiotProduct(this);

		return uiotDeviceLib;
	}

	public UiotDeviceLib removeUiotDeviceLib(UiotDeviceLib uiotDeviceLib) {
		getUiotDeviceLibs().remove(uiotDeviceLib);
		uiotDeviceLib.setUiotProduct(null);

		return uiotDeviceLib;
	}

	public List<UiotDeviceLog> getUiotDeviceLogs() {
		return this.uiotDeviceLogs;
	}

	public void setUiotDeviceLogs(List<UiotDeviceLog> uiotDeviceLogs) {
		this.uiotDeviceLogs = uiotDeviceLogs;
	}

	public UiotDeviceLog addUiotDeviceLog(UiotDeviceLog uiotDeviceLog) {
		getUiotDeviceLogs().add(uiotDeviceLog);
		uiotDeviceLog.setUiotProduct(this);

		return uiotDeviceLog;
	}

	public UiotDeviceLog removeUiotDeviceLog(UiotDeviceLog uiotDeviceLog) {
		getUiotDeviceLogs().remove(uiotDeviceLog);
		uiotDeviceLog.setUiotProduct(null);

		return uiotDeviceLog;
	}

	public List<UiotDeviceRealtime> getUiotDeviceRealtimes() {
		return this.uiotDeviceRealtimes;
	}

	public void setUiotDeviceRealtimes(List<UiotDeviceRealtime> uiotDeviceRealtimes) {
		this.uiotDeviceRealtimes = uiotDeviceRealtimes;
	}

	public UiotDeviceRealtime addUiotDeviceRealtime(UiotDeviceRealtime uiotDeviceRealtime) {
		getUiotDeviceRealtimes().add(uiotDeviceRealtime);
		uiotDeviceRealtime.setUiotProduct(this);

		return uiotDeviceRealtime;
	}

	public UiotDeviceRealtime removeUiotDeviceRealtime(UiotDeviceRealtime uiotDeviceRealtime) {
		getUiotDeviceRealtimes().remove(uiotDeviceRealtime);
		uiotDeviceRealtime.setUiotProduct(null);

		return uiotDeviceRealtime;
	}

}