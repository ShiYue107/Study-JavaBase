package com.dao;

import java.sql.Date;

/**
 * 
 * @author ZhangFeng �����������ݿ�һһ��Ӧ��ʵ����
 */
public class Vip {
	private int memberid;//��Աid
	private String phone;//��Ա�ֻ���
	private String name;//��Ա����
	private String sex;//��Ա�Ա�
	private Date openDate;//��������
	private double balance;//�������
	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vip(int memberid, String phone, String name, String sex, Date openDate, double balance) {
		super();
		this.memberid = memberid;
		this.phone = phone;
		this.name = name;
		this.sex = sex;
		this.openDate = openDate;
		this.balance = balance;
	}
	public int getMemberid() {
		return memberid;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
		return "memberid=" + memberid + ", phone=" + phone + ", name=" + name + ", sex=" + sex + ", openDate="
				+ openDate + ", balance=" + balance;
	}
	
}
