package com.zf.dao;


import javax.servlet.jsp.jstl.sql.Result;

import com.zf.pojo.Topic;

public interface TopicDao {

	public Result findTopic(int topicId);//根据主题ID，查找主题信息
	public Result findListTopic(int page,int boardId);//查询帖子，返回第page页帖子列表
	public int addTopic(Topic topic);//添加主题，返回增加个数
	public int deleteTopic(int topicId);//根据ID删除主题，返回删除个数
	public int updateTopic(Topic topic);//更新一个主题的信息，返回更新个数
	public int findCountTopic(int boardId);//根据版块ID取得该版块的主题数
	public Topic findLastTopic(int boardId);
	
}
