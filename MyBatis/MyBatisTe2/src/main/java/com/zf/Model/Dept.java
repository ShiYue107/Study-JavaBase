package com.zf.Model;

public class Dept {

	private int id;
	private String dept_name;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int id, String dept_name) {
		super();
		this.id = id;
		this.dept_name = dept_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", dept_name=" + dept_name + "]";
	}

	
}
