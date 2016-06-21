package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uiot_app_key_map database table.
 * 
 */
@Entity
@Table(name="uiot_app_key_map")
@NamedQuery(name="UiotAppKeyMap.findAll", query="SELECT u FROM UiotAppKeyMap u")
public class UiotAppKeyMap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="app_key")
	private String appKey;

	@Column(name="app_name")
	private String appName;

	@Column(name="product_id")
	private String productId;

	public UiotAppKeyMap() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}