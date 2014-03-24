package com.order.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 图片信息
 * 
 * @author FJ
 * 
 */
@Entity
@Table(name = "t_images")
public class Images {
	/**
	 * 自增长ID
	 */
	private int id;

	/**
	 * 图片所属资源ID
	 */
	private int belongId;
	
	/**
	 * 图片所属资源类型
	 */
	private int imageType;
	
	/**
	 * 图片存储地址
	 */
	private String url;
	
	/**
	 * ts
	 */
	private Date ts = new Date();
	
	/**
	 * 删除标志
	 */
	private int dr = 0;

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	@Column(unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column
	public int getBelongId() {
		return belongId;
	}

	public void setBelongId(int belongId) {
		this.belongId = belongId;
	}

	@Column
	public int getImageType() {
		return imageType;
	}

	public void setImageType(int imageType) {
		this.imageType = imageType;
	}

	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}
}
