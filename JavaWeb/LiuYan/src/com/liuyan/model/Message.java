package com.liuyan.model;

import java.sql.Date;

public class Message {
	private int id;
	private String name;
	private Date time;
	private String title;
	private String message;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int id, String name, Date time, String title, String message) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.title = title;
		this.message = message;
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
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", name=" + name + ", time=" + time + ", title=" + title + ", message=" + message
				+ "]";
	}

	
	

}
