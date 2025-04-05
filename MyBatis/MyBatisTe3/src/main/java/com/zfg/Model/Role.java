package com.zfg.Model;

import java.util.Date;
import java.util.List;

public class Role {

	private int id;
	private String role_name;
	private int enabled;
	private String create_by;
	private Date create_time;
	
	private List<Privilege> privilege;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int id, String role_name, int enabled, String create_by, Date create_time, List<Privilege> privilege) {
		super();
		this.id = id;
		this.role_name = role_name;
		this.enabled = enabled;
		this.create_by = create_by;
		this.create_time = create_time;
		this.privilege = privilege;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public List<Privilege> getPrivilege() {
		return privilege;
	}
	public void setPrivilege(List<Privilege> privilege) {
		this.privilege = privilege;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", role_name=" + role_name + ", enabled=" + enabled + ", create_by=" + create_by
				+ ", create_time=" + create_time + ", privilege=" + privilege + "]";
	}
	
	
}
