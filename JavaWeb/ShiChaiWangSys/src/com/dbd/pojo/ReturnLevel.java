package com.dbd.pojo;
/**
* @author IT_Koma
* @date 2021年3月21日 下午3:03:48
* @version 1.0
* 类说明
*/
public class ReturnLevel {

	private String id;
	private String projectId;
	private String orderMoney;
	public ReturnLevel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReturnLevel(String id, String projectId, String orderMoney) {
		super();
		this.id = id;
		this.projectId = projectId;
		this.orderMoney = orderMoney;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(String orderMoney) {
		this.orderMoney = orderMoney;
	}
	@Override
	public String toString() {
		return "ReturnLevel [id=" + id + ", projectId=" + projectId + ", orderMoney=" + orderMoney + "]";
	}

}
