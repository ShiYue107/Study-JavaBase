package com.itkoma.Model;

public class WangFei {
	
	private int id;//用户编号
	private String number;//账号
	private String password;//密码
	private double balance;//余额
	private String descs;//描述
	
	@Override
	public String toString() {
		return "WangFei [id=" + id + ", number=" + number + ", password=" + password + ", balance=" + balance
				+ ", descs=" + descs + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public WangFei(int id, String number, String password, double balance, String descs) {
		super();
		this.id = id;
		this.number = number;
		this.password = password;
		this.balance = balance;
		this.descs = descs;
	}

	public WangFei() {
		super();
		// TODO Auto-generated constructor stub
	}

}
