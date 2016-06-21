package com.test.enties;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the uiot_feedback database table.
 * 
 */
@Entity
@Table(name="uiot_feedback")
@NamedQuery(name="UiotFeedback.findAll", query="SELECT u FROM UiotFeedback u")
public class UiotFeedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Lob
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private String deal;

	@Column(name="product_name")
	private String productName;

	//bi-directional many-to-one association to UiotUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private UiotUser uiotUser;

	public UiotFeedback() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDeal() {
		return this.deal;
	}

	public void setDeal(String deal) {
		this.deal = deal;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public UiotUser getUiotUser() {
		return this.uiotUser;
	}

	public void setUiotUser(UiotUser uiotUser) {
		this.uiotUser = uiotUser;
	}

}