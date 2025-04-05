package com.itkoma.model;

import java.util.Date;

public class Vip {

	private int id;
	private String phone;
	private String name;
	private String gender;
	private Date openDate;
	private double balance;
	
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vip(int id, String phone, String name, String gender, Date openDate, double balance) {
		super();
		this.id = id;
		this.phone = phone;
		this.name = name;
		this.gender = gender;
		this.openDate = openDate;
		this.balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Vip [id=" + id + ", phone=" + phone + ", name=" + name + ", gender=" + gender + ", openDate=" + openDate
				+ ", balance=" + balance + "]";
	}

	
}
