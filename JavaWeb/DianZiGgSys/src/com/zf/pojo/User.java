package com.zf.pojo;

public class User {
	
	private int uId = 1;//用来唯一标识用户
	private String uName = "default";//用户名
	private String uPass = "default";//用户密码
	private int gender = 2;//性别，1是女，2是男
	private String head = "";//头像，地址形式
	private String regTime = "";//注册时间

	public void getUserInfo() {
		System.out.println("=====用户信息====");
		System.out.println("用户名："+uName);
		System.out.println("用户密码："+uPass);
		char sex = gender == 1 ? '女':'男';
		System.out.println("性别："+sex);
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPass() {
		return uPass;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPass=" + uPass + ", gender=" + gender + ", head=" + head
				+ ", regTime=" + regTime + "]";
	}
	
}
