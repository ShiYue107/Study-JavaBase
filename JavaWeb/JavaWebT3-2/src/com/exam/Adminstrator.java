package com.exam;

public class Adminstrator {
	private String account;
	private String password;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Adminstrator() {
		
	}
	public Adminstrator(String account, String password) {
		this.account = account;
		this.password = password;
	}
}
