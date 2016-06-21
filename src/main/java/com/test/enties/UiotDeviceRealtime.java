package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uiot_device_realtime database table.
 * 
 */
@Entity
@Table(name="uiot_device_realtime")
@NamedQuery(name="UiotDeviceRealtime.findAll", query="SELECT u FROM UiotDeviceRealtime u")
public class UiotDeviceRealtime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="device_id")
	private String deviceId;

	@Column(name="device_status_data")
	private String deviceStatusData;

	@Column(name="online_status")
	private byte onlineStatus;

	//bi-directional one-to-one association to UiotDeviceLib
	@OneToOne
	@JoinColumn(name="device_id")
	private UiotDeviceLib uiotDeviceLib;

	//bi-directional many-to-one association to UiotProduct
	@ManyToOne
	@JoinColumn(name="product_id")
	private UiotProduct uiotProduct;

	public UiotDeviceRealtime() {
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceStatusData() {
		return this.deviceStatusData;
	}

	public void setDeviceStatusData(String deviceStatusData) {
		this.deviceStatusData = deviceStatusData;
	}

	public byte getOnlineStatus() {
		return this.onlineStatus;
	}

	public void setOnlineStatus(byte onlineStatus) {
		this.onlineStatus = onlineStatus;
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

}