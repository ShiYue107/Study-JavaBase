package com.zf.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

import com.zf.dao.ReplyDao;
import com.zf.pojo.Reply;

public class ReplyDaoImpl extends BaseDao implements ReplyDao {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	@Override
	public Reply findReply(int replyId) {
		String sql = "select * from reply where replyId=?";
		Reply reply = null;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, replyId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				reply = new Reply();
				reply.setReplyId(rs.getInt("replyId"));
				reply.setTitle(rs.getString("title"));
				reply.setContent(rs.getString("content"));
				reply.setPublishTime(rs.getString("publishTime"));
				reply.setModifyTime(rs.getString("modifyTime"));
				reply.setUid(rs.getInt("uId"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return reply;
	}

	@Override
	public int addReply(Reply reply) {
		String sql = "insert into REPLY(title,content,publishTime,modifyTime,uId,topicId) "
					+ "value(?,?,?,?,"+reply.getUid()+","+reply.getTopicId()+")";
		//取得日期时间
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String[] parm = {reply.getTitle(),reply.getContent(),time};
		return this.executeSQL(sql, parm);
	}

	@Override
	public int deleteReply(int replyId) {
		String sql = "delete from REPLY where replyId="+replyId;
		return this.executeSQL(sql, null);
	}

	@Override
	public int updateReply(Reply reply) {
		String sql = "update reply set title=?,content=?,modifyTime=? where replyId="
					 +reply.getReplyId();
		//取得日期时间
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String[] parm = {reply.getTitle(),reply.getContent(),time};
		return this.executeSQL(sql, parm);
	}

	@Override
	public Result findListReply(int page, int topicId) {
		conn = null;
		pstmt = null;
		rs = null;
		int rowBegin = 0;
		page = (page - 1) * 2;
		Result result = null;
		try {
			conn=this.getConn();
			String sql = "select reply.*,user.uname,user.head,user.regTime from reply ,user "
						+ "where reply.uid = user.uId and topicId = ? order by publishTime limit"
						  +page+",2";
			pstmt = conn.prepareStatement(sql);
			pstmt.setObject(1, topicId);
			rs = pstmt.executeQuery();
			result = ResultSupport.toResult(rs);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return result;
	}

	@Override
	public int findCountReply(int topicId) {
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select count(*) from reply where topicId="+topicId;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return count;
	}
}
