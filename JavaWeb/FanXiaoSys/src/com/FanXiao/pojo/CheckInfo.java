package com.FanXiao.pojo;

import java.util.Date;

public class CheckInfo {
	private int id;
	private String name;
	private String gender;
	private String from;
	private Date returnDate;
	private Date checkDate;
	private String state;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}
	public String getState() {
		return state;
	}
	public CheckInfo(int id, String name, String gender, String from, Date returnDate, Date checkDate,
			String state) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.from = from;
		this.returnDate = returnDate;
		this.checkDate = checkDate;
		this.state = state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "CheckInfo [id=" + id + ", name=" + name + ", gender=" + gender + ", from=" + from + ", returnDate="
				+ returnDate + ", checkDate=" + checkDate + ", state=" + state + "]";
	}
}
