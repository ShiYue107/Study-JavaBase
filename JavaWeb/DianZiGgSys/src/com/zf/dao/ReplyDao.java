package com.zf.dao;

import javax.servlet.jsp.jstl.sql.Result;

import com.zf.pojo.Reply;

public interface ReplyDao {
	
	//��������ID�����һظ�����Ϣ
	public Reply findReply(int replyId);
	//���ӻظ���Ϣ���������Ӹ���
	public int addReply(Reply reply);
	//���ݻظ�IDɾ���ظ�������ɾ������
	public int deleteReply(int replyId);
	//�޸Ļظ���Ϣ�������޸ĸ���
	public int updateReply(Reply reply);
	//��ѯ�ظ�������ĳ�����pageҳ�ظ��б�
	public Result findListReply(int page,int topicId);
	//��������ID��ѯ��������Ļظ�����
	public int findCountReply(int topicId);
	
}
