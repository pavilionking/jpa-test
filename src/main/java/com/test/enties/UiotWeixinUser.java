package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the uiot_weixin_user database table.
 * 
 */
@Entity
@Table(name="uiot_weixin_user")
@NamedQuery(name="UiotWeixinUser.findAll", query="SELECT u FROM UiotWeixinUser u")
public class UiotWeixinUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private String userId;

	@Column(name="weixin_city")
	private String weixinCity;

	@Column(name="weixin_country")
	private String weixinCountry;

	@Column(name="weixin_headimg_url")
	private String weixinHeadimgUrl;

	@Column(name="weixin_nickname")
	private String weixinNickname;

	@Column(name="weixin_openid")
	private String weixinOpenid;

	@Column(name="weixin_province")
	private String weixinProvince;

	@Column(name="weixin_username")
	private String weixinUsername;

	public UiotWeixinUser() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWeixinCity() {
		return this.weixinCity;
	}

	public void setWeixinCity(String weixinCity) {
		this.weixinCity = weixinCity;
	}

	public String getWeixinCountry() {
		return this.weixinCountry;
	}

	public void setWeixinCountry(String weixinCountry) {
		this.weixinCountry = weixinCountry;
	}

	public String getWeixinHeadimgUrl() {
		return this.weixinHeadimgUrl;
	}

	public void setWeixinHeadimgUrl(String weixinHeadimgUrl) {
		this.weixinHeadimgUrl = weixinHeadimgUrl;
	}

	public String getWeixinNickname() {
		return this.weixinNickname;
	}

	public void setWeixinNickname(String weixinNickname) {
		this.weixinNickname = weixinNickname;
	}

	public String getWeixinOpenid() {
		return this.weixinOpenid;
	}

	public void setWeixinOpenid(String weixinOpenid) {
		this.weixinOpenid = weixinOpenid;
	}

	public String getWeixinProvince() {
		return this.weixinProvince;
	}

	public void setWeixinProvince(String weixinProvince) {
		this.weixinProvince = weixinProvince;
	}

	public String getWeixinUsername() {
		return this.weixinUsername;
	}

	public void setWeixinUsername(String weixinUsername) {
		this.weixinUsername = weixinUsername;
	}

}