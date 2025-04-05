package com.zf.dao;

import com.zf.pojo.User;

public interface UserDao {

	public static final int FEMALE = 1;//����Ů��
	public static final int MALE = 2;//��������
	public User findUser(String uName);//�����û���������̳�û�
	public User findUser(int uId);//�����û�ID������̳�û�
	public int addUser(User user);//������̳�û����������Ӹ���
	public int updateUser(User user);//�޸���̳�û�����Ϣ�������޸ĸ���
	
}
