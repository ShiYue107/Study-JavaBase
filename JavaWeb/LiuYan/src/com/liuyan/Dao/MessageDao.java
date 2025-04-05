package com.liuyan.Dao;

import java.util.List;

import com.liuyan.model.Message;

public interface MessageDao {
	//Ìí¼ÓÁôÑÔ
	public  boolean addMessage(Message msg);
	//É¾³ıÁôÑÔ
	public boolean deleteMsg(int id);
	//ĞŞ¸ÄÁôÑÔ
	public boolean updateMsg(Message msg);
	//²éÑ¯ÁôÑÔ
	public List<Message> queryAllMsg();
	
	public Message findOneMsg(int id);

}
