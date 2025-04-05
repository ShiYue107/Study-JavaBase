package com.gwc.Modle;

import java.util.Date;

//与数据库一一对应的实体类
public class Goods {
	private int id;//商品编号
	private String name;//商品名称
	private double price;//价格
	private Date createTime;//创建日期
	private String desc;//备注
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int id, String name, double price, Date createTime, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createTime = createTime;
		this.desc = desc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", createTime=" + createTime + ", desc="
				+ desc + "]";
	}
	
}
