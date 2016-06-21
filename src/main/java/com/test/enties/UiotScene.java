package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the uiot_scene database table.
 * 
 */
@Entity
@Table(name="uiot_scene")
@NamedQuery(name="UiotScene.findAll", query="SELECT u FROM UiotScene u")
public class UiotScene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="scene_id")
	private String sceneId;

	@Column(name="create_time")
	private Timestamp createTime;

	private byte enable;

	private byte isvalid;

	@Column(name="scene_name")
	private String sceneName;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	//bi-directional many-to-one association to UiotSceneDevice
	@OneToMany(mappedBy="uiotScene")
	private List<UiotSceneDevice> uiotSceneDevices;

	public UiotScene() {
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}

	public byte getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(byte isvalid) {
		this.isvalid = isvalid;
	}

	public String getSceneName() {
		return this.sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public UiotUser getUiotUser() {
		return this.uiotUser;
	}

	public void setUiotUser(UiotUser uiotUser) {
		this.uiotUser = uiotUser;
	}

	public List<UiotSceneDevice> getUiotSceneDevices() {
		return this.uiotSceneDevices;
	}

	public void setUiotSceneDevices(List<UiotSceneDevice> uiotSceneDevices) {
		this.uiotSceneDevices = uiotSceneDevices;
	}

	public UiotSceneDevice addUiotSceneDevice(UiotSceneDevice uiotSceneDevice) {
		getUiotSceneDevices().add(uiotSceneDevice);
		uiotSceneDevice.setUiotScene(this);

		return uiotSceneDevice;
	}

	public UiotSceneDevice removeUiotSceneDevice(UiotSceneDevice uiotSceneDevice) {
		getUiotSceneDevices().remove(uiotSceneDevice);
		uiotSceneDevice.setUiotScene(null);

		return uiotSceneDevice;
	}

}