package com.zf.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

import com.zf.dao.TopicDao;
import com.zf.pojo.Topic;

public class TopicDaoImpl extends BaseDao implements TopicDao {

	@Override
	public Result findTopic(int topicId) {
		String sql = "select * from topic where topicId=?";
		Topic topic = null; 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Result result = null;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, topicId);
			rs = pstmt.executeQuery();
			result = ResultSupport.toResult(rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return result;
	}

	@Override
	public Result findListTopic(int page, int boardId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Result result = null;//离线结果集
		List list = new ArrayList();
		int rowBegin = 0;
		page = (page - 1) * 2;
		String sql="select *,(select count(*) from reply where reply.topicId = topic.topicId)"
				+ "cnt from topic,user where topic.uId = user.uId and boardId = ? order by "
				+ "publishTime desc limit"+page+",2";
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardId);
			rs = pstmt.executeQuery();
			result = ResultSupport.toResult(rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return result;
	}

	@Override
	public int addTopic(Topic topic) {
		
		String sql = "insert into topic(title,content,publishTime,modifyTime,uId,boardId) value"
				+ "(?,?,?,?,"+topic.getUid()+","+topic.getBoardId()+")";
		//取得日期时间
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String[] parm = {topic.getTitle(),topic.getContent(),time,time};
		return this.executeSQL(sql, parm);
	}

	@Override
	public int deleteTopic(int topicId) {
		String sql = "delete from topic where topicId="+topicId;
		return this.executeSQL(sql, null);
	}

	@Override
	public int updateTopic(Topic topic) {
		String sql = "update topic set title=?,content=?,modifyTime=? where topicId="+
						topic.getTopicId();
		//取得日期时间
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String[] parm = {topic.getTitle(),topic.getContent(),time};
		return this.executeSQL(sql, parm);
	}

	@Override
	public int findCountTopic(int boardId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		String sql = "select count(*) from topic where boardId="+boardId;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);//取得主题数
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return count;
	}

	@Override
	public Topic findLastTopic(int boardId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from topic where boardId=? order by publishTime edsc";
		Topic topic = null;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setObject(1, boardId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				topic = new Topic();
				topic.setTopicId(rs.getInt("topicId"));
				topic.setTitle(rs.getString("title"));
				topic.setPublishTime(rs.getString("publishTime"));
				topic.setUid(rs.getInt("uId"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return topic;
	}
}
