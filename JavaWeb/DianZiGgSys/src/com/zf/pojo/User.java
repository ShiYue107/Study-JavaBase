package com.zf.pojo;

public class User {
	
	private int uId = 1;//����Ψһ��ʶ�û�
	private String uName = "default";//�û���
	private String uPass = "default";//�û�����
	private int gender = 2;//�Ա�1��Ů��2����
	private String head = "";//ͷ�񣬵�ַ��ʽ
	private String regTime = "";//ע��ʱ��

	public void getUserInfo() {
		System.out.println("=====�û���Ϣ====");
		System.out.println("�û�����"+uName);
		System.out.println("�û����룺"+uPass);
		char sex = gender == 1 ? 'Ů':'��';
		System.out.println("�Ա�"+sex);
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPass() {
		return uPass;
	}

	public void setuPass(String uPass) {
		this.uPass = uPass;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPass=" + uPass + ", gender=" + gender + ", head=" + head
				+ ", regTime=" + regTime + "]";
	}
	
}
