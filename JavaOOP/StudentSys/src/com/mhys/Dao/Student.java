package com.mhys.Dao;

import java.util.Date;

public class Student {
	private int	id;//序号
	private String	name;//学生姓名
	private String	cardID;//学生学号
	private Date date;//创建日期
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String cardID, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.cardID = cardID;
		this.date = date;
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

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", cardID=" + cardID + ", date=" + date;
	}
}
