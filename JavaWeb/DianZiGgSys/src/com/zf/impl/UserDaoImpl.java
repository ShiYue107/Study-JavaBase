package com.zf.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.zf.dao.UserDao;
import com.zf.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	@Override
	public User findUser(String uName) {
		String sql = "select * from USER where uName=?";
		User user =null;
		try {
			conn = this.getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,uName);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				user = new User();
				user.setuId(rs.getInt("uId"));
				user.setuName(rs.getString("uName"));
				user.setuPass(rs.getString("uPass"));
				user.setGender(rs.getInt("gender"));
				user.setHead(rs.getString("head"));
				user.setRegTime(rs.getString("regTime"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			this.closeConn(conn, pstmt, rs);
		}
		return user;
	}

	@Override
	public User findUser(int uId) {
		String sql = "select * from USER where uId=?";
		User user = null;
		try {
			conn = getConn();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, uId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				user.setuId(rs.getInt("uId"));
				user.setuName(rs.getString("uName"));
				user.setuPass(rs.getString("uPass"));
				user.setGender(rs.getInt("gender"));
				user.setHead(rs.getString("head"));
				user.setRegTime(rs.getString("regTime"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeConn(conn, pstmt, rs);
		}
		return user;
	}

	@Override
	public int addUser(User user) {
		String sql = "insert into USER(uname,upass,gender,head,regTime) values(?,?,"+user.getGender()
						+",?,?)";
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String[] parm = {user.getuName(),user.getuPass(),user.getHead(),time};
		return this.executeSQL(sql, parm);
	}

	@Override
	public int updateUser(User user) {
		String sql = "update USER set upass=? where uname=?";
		String[] parm = {user.getuPass(),user.getuName()};
		return this.executeSQL(sql, parm);
	}

}
