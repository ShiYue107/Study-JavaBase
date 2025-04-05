package com.liuyan.Dao;

import java.util.List;

import com.liuyan.model.Message;

public interface MessageDao {
	//�������
	public  boolean addMessage(Message msg);
	//ɾ������
	public boolean deleteMsg(int id);
	//�޸�����
	public boolean updateMsg(Message msg);
	//��ѯ����
	public List<Message> queryAllMsg();
	
	public Message findOneMsg(int id);

}
