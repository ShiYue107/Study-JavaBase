package com.zf.Dao;

import java.util.Date;

/*
 * 该类是与数据表tb_xfmx一一对应的实体类
 */
public class PCSume {
	private int id;//编号
	private String name;//消费名称
	private double money;//消费金额
	private Date date;//消费日期
	private String userName;//消费人
	
	public PCSume() {
		
	}
	public PCSume(int id, String name, double money, Date date, String userName) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.date = date;
		this.userName = userName;
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
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "PCSume [id=" + id + ", name=" + name + ", money=" + money + ", date=" + date + ", userName=" + userName
				+ "]";
	}
}
