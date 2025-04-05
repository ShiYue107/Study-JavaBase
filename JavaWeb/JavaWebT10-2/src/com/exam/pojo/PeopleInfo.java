package com.exam.pojo;

public class PeopleInfo {
	private Integer peopleId;
	private String peopleName;
	public PeopleInfo(Integer peopleId, String peopleName) {
		super();
		this.peopleId = peopleId;
		this.peopleName = peopleName;
	}
	public Integer getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(Integer peopleId) {
		this.peopleId = peopleId;
	}
	public String getPeopleName() {
		return peopleName;
	}
	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}
	
}
