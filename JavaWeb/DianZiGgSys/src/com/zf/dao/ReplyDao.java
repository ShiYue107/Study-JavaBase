package com.zf.dao;

import javax.servlet.jsp.jstl.sql.Result;

import com.zf.pojo.Reply;

public interface ReplyDao {
	
	//根据主题ID，查找回复的信息
	public Reply findReply(int replyId);
	//增加回复信息，返回增加个数
	public int addReply(Reply reply);
	//根据回复ID删除回复，返回删除个数
	public int deleteReply(int replyId);
	//修改回复信息，返回修改个数
	public int updateReply(Reply reply);
	//查询回复，返回某主题第page页回复列表
	public Result findListReply(int page,int topicId);
	//根据主题ID查询出该主题的回复条数
	public int findCountReply(int topicId);
	
}
