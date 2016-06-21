package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uiot_qq_user database table.
 * 
 */
@Entity
@Table(name="uiot_qq_user")
@NamedQuery(name="UiotQqUser.findAll", query="SELECT u FROM UiotQqUser u")
public class UiotQqUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="is_yellow_vip")
	private byte isYellowVip;

	@Column(name="is_yellow_year_vip")
	private byte isYellowYearVip;

	private String level;

	@Column(name="qq_nickname")
	private String qqNickname;

	@Column(name="qq_openid")
	private String qqOpenid;

	@Column(name="qq_username")
	private String qqUsername;

	private byte vip;

	@Column(name="yellow_vip_level")
	private String yellowVipLevel;

	public UiotQqUser() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public byte getIsYellowVip() {
		return this.isYellowVip;
	}

	public void setIsYellowVip(byte isYellowVip) {
		this.isYellowVip = isYellowVip;
	}

	public byte getIsYellowYearVip() {
		return this.isYellowYearVip;
	}

	public void setIsYellowYearVip(byte isYellowYearVip) {
		this.isYellowYearVip = isYellowYearVip;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getQqNickname() {
		return this.qqNickname;
	}

	public void setQqNickname(String qqNickname) {
		this.qqNickname = qqNickname;
	}

	public String getQqOpenid() {
		return this.qqOpenid;
	}

	public void setQqOpenid(String qqOpenid) {
		this.qqOpenid = qqOpenid;
	}

	public String getQqUsername() {
		return this.qqUsername;
	}

	public void setQqUsername(String qqUsername) {
		this.qqUsername = qqUsername;
	}

	public byte getVip() {
		return this.vip;
	}

	public void setVip(byte vip) {
		this.vip = vip;
	}

	public String getYellowVipLevel() {
		return this.yellowVipLevel;
	}

	public void setYellowVipLevel(String yellowVipLevel) {
		this.yellowVipLevel = yellowVipLevel;
	}

}