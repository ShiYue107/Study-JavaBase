package com.liuyan.model;

public class Login {
	private int id;//编号
	private String name;//用户名
	private  String password;//密码
	private int role;//角色
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int id, String name, String password, int role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}

	

}
