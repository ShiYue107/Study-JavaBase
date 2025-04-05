package com.dbd.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
* @author IT_Koma
* @date 2021年3月22日 下午4:32:09
* @version 1.0
* 类说明
*/


public class DBUtils {

	static final String DRIVER = "com.mysql.jdbc.Driver";
	
	static final String URL = "jdbc:mysql://localhost:3306/shichaiwang?characterEncoding=utf-8";
	
	static final String NAME = "root";
	
	static final String PASSWORD = "107610";
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,NAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConn(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		try {
			if (conn != null)
				conn.close();
			if(pstmt != null)
				pstmt.close();
			if(rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBUtils.getConn();
	}
}
