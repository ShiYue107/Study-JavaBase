package com.dbd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbd.Utils.DBUtils;
import com.dbd.pojo.Admin;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021年5月24日 下午10:59:17
* @version 1.0
* 类说明
*/
public class AdminDao {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	public static Admin adminLogin(String username,String password) {
		//获取数据库连接
		conn = DBUtils.getConn();
		//书写sql语句
		String sql = "select * from admininfo where userName=? and password=?";
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
				return new Admin(rs.getInt("id"),rs.getString("username"),rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return null;
	}
}
