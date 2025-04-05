package com.zf.Dao;

import java.util.Date;

/**
 * 
 * @author Administrator
 *	该类是与数据表tb_class一一对应的实体类
 */
public class Classs {
	private int	id;//序号
	private String name;//姓名
	private String sex;//性别
	private String post;//职务
	private String idcard;//学号
	private double balance;//余额
	private Date createDate;//创建时间
	
	public Classs() {
		super();
	}

	public Classs(int id, String name, String sex, String post, String idcard, double balance, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.post = post;
		this.idcard = idcard;
		this.balance = balance;
		this.createDate = createDate;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", sex=" + sex + ", post=" + post + ", idcard=" + idcard
				+ ", balance=" + balance + ", createDate=" + createDate;
	}
	
}
