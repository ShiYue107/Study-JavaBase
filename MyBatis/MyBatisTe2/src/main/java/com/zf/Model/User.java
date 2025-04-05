package com.zf.Model;

import java.util.Arrays;
import java.util.Date;

public class User {
	
	private int id;
	private String user_name;
	private String user_password;
	private String user_email;
	private String user_info;
	private byte[] head_img;
	private Date create_time;
	private int dept_id;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String user_name, String user_password, String user_email, String user_info, byte[] head_img,
			Date create_time, int dept_id) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_email = user_email;
		this.user_info = user_info;
		this.head_img = head_img;
		this.create_time = create_time;
		this.dept_id = dept_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_info() {
		return user_info;
	}
	public void setUser_info(String user_info) {
		this.user_info = user_info;
	}
	public byte[] getHead_img() {
		return head_img;
	}
	public void setHead_img(byte[] head_img) {
		this.head_img = head_img;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", user_password=" + user_password + ", user_email="
				+ user_email + ", user_info=" + user_info + ", head_img=" + Arrays.toString(head_img) + ", create_time="
				+ create_time + ", dept_id=" + dept_id + "]";
	}
	
}
