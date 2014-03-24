package com.order.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author FJ
 * 
 */
@Entity
@Table(name = "t_dish")
public class Dish {
	public static final String ID = "id";
	public static final String CLASSID = "classId";
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String DESCRIPTION  = "description ";
	public static final String ORDERNO = "orderNo";
	public static final String TS = "ts";
	public static final String DR = "dr";

	/**
	 * 自增长ID
	 */
	private int id;

	/**
	 * 所属菜品分类
	 */
	private int classId;

	/**
	 * 菜品编码
	 */
	private String code;

	/**
	 * 菜品名称
	 */
	private String name;

	/**
	 * 菜品图片地址
	 */
	private List<Images> images;

	/**
	 * 菜品描述信息
	 */
	private String description;

	/**
	 * 显示排序号
	 */
	private int orderNo;

	/**
	 * 时间戳
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
	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	@Column
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "belongId", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	@Column
	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	@Column
	public Date getTs() {
		return ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	@Column
	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	@Column
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
