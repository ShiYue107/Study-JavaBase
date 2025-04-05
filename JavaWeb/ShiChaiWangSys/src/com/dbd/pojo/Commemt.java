package com.dbd.pojo;

import java.util.Date;

/**
* @author IT_Koma
* @date 2021年3月21日 下午2:45:39
* @version 1.0
* 类说明
*/
public class Commemt {

	private int id;
	private int projectId;
	private int userId;
	private String content;
	@Override
	public String toString() {
		return "Commemt [id=" + id + ", projectId=" + projectId + ", userId=" + userId + ", content=" + content
				+ ", time=" + time + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Commemt(int id, int projectId, int userId, String content, Date time) {
		super();
		this.id = id;
		this.projectId = projectId;
		this.userId = userId;
		this.content = content;
		this.time = time;
	}
	public Commemt() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Date time;

}
