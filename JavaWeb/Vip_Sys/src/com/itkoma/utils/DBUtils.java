package com.itkoma.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {

	static String driver = "com.mysql.jdbc.Driver";
	
	static String ulr = "jdbc:mysql://localhost:3306/db_vip?characterEncoding=utf-8";
	
	static String name = "root";
	
	static String password = "107610";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(ulr,name,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConn(Connection conn,ResultSet rs,PreparedStatement pstmt) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args) {
		Connection conn = DBUtils.getConn();
		System.out.println(conn);
	}
}
