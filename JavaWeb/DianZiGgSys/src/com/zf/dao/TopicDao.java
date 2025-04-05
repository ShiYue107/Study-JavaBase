package com.zf.dao;


import javax.servlet.jsp.jstl.sql.Result;

import com.zf.pojo.Topic;

public interface TopicDao {

	public Result findTopic(int topicId);//��������ID������������Ϣ
	public Result findListTopic(int page,int boardId);//��ѯ���ӣ����ص�pageҳ�����б�
	public int addTopic(Topic topic);//������⣬�������Ӹ���
	public int deleteTopic(int topicId);//����IDɾ�����⣬����ɾ������
	public int updateTopic(Topic topic);//����һ���������Ϣ�����ظ��¸���
	public int findCountTopic(int boardId);//���ݰ��IDȡ�øð���������
	public Topic findLastTopic(int boardId);
	
}
