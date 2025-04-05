package com.dbd.pojo;

import java.util.Date;

/**
* @author IT_Koma
* @date 2021年5月24日 下午3:34:36
* @version 1.0
* 类说明
* 用户的实体类
*/
public class User {

	private int id;
	private String username;
	private String password;
	private String phone;
	private String mail;
	private Date date;
	public User(int id, String username, String password, String phone, String mail, Date date) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.mail = mail;
		this.date = date;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + ", mail="
				+ mail + ", date=" + date + "]";
	}
	
	
}
