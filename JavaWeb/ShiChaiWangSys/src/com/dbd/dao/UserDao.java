package com.dbd.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbd.Utils.DBUtils;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021年5月5日 下午3:26:08
* @version 1.0
* 类说明
* 管理员管理用户的Dao类
*/
public class UserDao {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	//查询所有用户
	public static List<User> queryAll(){
		//获取数据库连接
		conn = DBUtils.getConn();
		//书写sql语句
		String sql = "select * from user";
		try {
			//创建pstmt管理器
			pstmt = conn.prepareStatement(sql);
			//执行sql
			rs = pstmt.executeQuery();
			//处理结果集
			if (rs != null) {
				List<User> list = new ArrayList<User>();
				while (rs.next()) {
					list.add(new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),
							rs.getString("phone"),rs.getString("mail"),
							rs.getDate("date")));
				}
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return null;
	}
	
	public static User loginOne(String username,String password) {
		//获取数据库连接
		conn = DBUtils.getConn();
		//书写sql语句
		String sql = "select * from user where userName=? and password=?";
		try {
			//创建pstmt管理器
			pstmt = conn.prepareStatement(sql);
			//赋值
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			//执行sql
			rs = pstmt.executeQuery();
			//处理结果集
			if (rs != null && rs.next()) {
				return new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),
						rs.getString("phone"),rs.getString("mail"),
						rs.getDate("date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return null;
	}
	
	public static int addUser(User user) {
		//获取数据库连接
		conn = DBUtils.getConn();
					
		//书写sql
		String sql = "insert into user values(0,?,?,?,?,?)";
		try {
			//创建pstmt管理器
			pstmt = conn.prepareStatement(sql);
			//赋值
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getMail());
			pstmt.setString(4, user.getPhone());
			pstmt.setDate(5, new Date(user.getDate().getTime()));
			int result = pstmt.executeUpdate();
			if (result>0) {
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	public static void main(String[] args) {
		List<User> list = new UserDao().queryAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
