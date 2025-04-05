package com.dbd.pojo;

import java.util.Date;

/**
* @author IT_Koma
* @date 2021年3月21日 下午2:50:46
* @version 1.0
* 类说明
*/
public class Project {

	private int id;
	private String projectName;
	private String projectContent;
	private int userId;
	private Date creatDate;
	private double money;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String projectName, String projectContent, int userId, Date creatDate, double money) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectContent = projectContent;
		this.userId = userId;
		this.creatDate = creatDate;
		this.money = money;
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectContent() {
		return projectContent;
	}
	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", projectContent=" + projectContent + ", userId="
				+ userId + ", creatDate=" + creatDate + ", money=" + money + "]";
	}
	
	
}
