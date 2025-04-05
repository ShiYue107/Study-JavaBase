package com.zf.test;

public class UserInfo {
	
	 private String no;
	 private String naem;
	 private String sex;
	 
	public UserInfo() {
		super();
	}
	public UserInfo(String no, String naem, String sex) {
		super();
		this.no = no;
		this.naem = naem;
		this.sex = sex;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getNaem() {
		return naem;
	}
	public void setNaem(String naem) {
		this.naem = naem;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString() {
		return no +" "+ naem +" " + sex;
	}
	
}