package com.zf.Model;

public class Privilege {
	
	private String id;
	private String privilege_name;
	private String privilege_url;
	
	public Privilege() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Privilege(String id, String privilege_name, String privilege_url) {
		super();
		this.id = id;
		this.privilege_name = privilege_name;
		this.privilege_url = privilege_url;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrivilege_name() {
		return privilege_name;
	}
	public void setPrivilege_name(String privilege_name) {
		this.privilege_name = privilege_name;
	}
	public String getPrivilege_url() {
		return privilege_url;
	}
	public void setPrivilege_url(String privilege_url) {
		this.privilege_url = privilege_url;
	}
	
	@Override
	public String toString() {
		return "Privilege [id=" + id + ", privilege_name=" + privilege_name + ", privilege_url=" + privilege_url + "]";
	}

	
}
