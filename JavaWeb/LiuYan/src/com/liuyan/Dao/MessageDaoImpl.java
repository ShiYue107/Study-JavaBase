package com.liuyan.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.liuyan.Utils.DBUtils;
import com.liuyan.model.Message;

public class MessageDaoImpl implements MessageDao{
	Connection conn =null;
	ResultSet rs =null;
	PreparedStatement smt=null;
	@Override
	public boolean addMessage(Message msg) {
		conn = DBUtils.getConn();
		String sql = "insert into message values(null,?,?,?,?)";
		try {
			smt = conn.prepareStatement(sql);
			//为占位符赋值
			smt.setString(1, msg.getName());
			smt.setDate(2, msg.getTime());
			smt.setString(3, msg.getTitle());
			smt.setString(4,msg.getMessage());
			//后执行SQL
			int result = smt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return false;
	}

	@Override
	public boolean deleteMsg(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMsg(Message msg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Message> queryAllMsg() {
		conn = DBUtils.getConn();
		String sql = "select * from message";
		try {
			smt = conn.prepareStatement(sql);
			//执行sql
			rs = smt.executeQuery();
			if(rs!=null) {
				List<Message> list = new ArrayList<Message>();
				while(rs.next()) {
					Message msg = new Message();
					msg.setId(rs.getInt("id"));
					msg.setName(rs.getString("name"));
					msg.setTime(new Date(rs.getDate("time").getTime()));
					msg.setTitle(rs.getString("title"));
					msg.setMessage(rs.getString("message"));
					list.add(msg);
				}
				return list;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return null;
	}

	@Override
	public Message findOneMsg(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
