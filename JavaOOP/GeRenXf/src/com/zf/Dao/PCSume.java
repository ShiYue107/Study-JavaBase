package com.zf.Dao;

import java.util.Date;

/*
 * �����������ݱ�tb_xfmxһһ��Ӧ��ʵ����
 */
public class PCSume {
	private int id;//���
	private String name;//��������
	private double money;//���ѽ��
	private Date date;//��������
	private String userName;//������
	
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
