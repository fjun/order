package com.order.pojos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 菜品分类
 * 
 * @author FJ
 * 
 */
@Entity
@Table(name = "t_dish_class")
public class DishClass {
	public static final String ID = "id";
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String PID = "pid";
	public static final String ORDERNO = "orderNo";
	public static final String TS = "ts";
	public static final String DR = "dr";

	/**
	 * 自增长ID
	 */
	private int id;

	/**
	 * 菜品分类编码
	 */
	private String code;

	/**
	 * 菜品分类名称
	 */
	private String name;

	/**
	 * 父节分类
	 */
	private DishClass parent;

	/**
	 * 子分类
	 */
	private List<DishClass> children;

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

	/**
	 * 分类下的菜品
	 */
	private List<Dish> dishes;

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

	@Column(nullable = false)
	public int getDr() {
		return dr;
	}

	public void setDr(int dr) {
		this.dr = dr;
	}

	@OneToMany(mappedBy = Dish.CLASSID)
	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	@ManyToOne
	@JoinColumn(name = "pid")
	public DishClass getParent() {
		return parent;
	}

	public void setParent(DishClass parent) {
		this.parent = parent;
	}

	@OneToMany(mappedBy = "parent", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	public List<DishClass> getChildren() {
		return children;
	}

	public void setChildren(List<DishClass> children) {
		this.children = children;
	}
}
