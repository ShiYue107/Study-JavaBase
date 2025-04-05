package com.FanXiao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	
	//数据库驱动	com.mysql.jdbc.Driver.class
	public static String driver = "com.mysql.jdbc.Driver" ;
	//数据库路径
	public static String url = "jdbc:mysql://localhost:3306/db_fanxiao";
	//数据库用户名
	public static String name = "root";
	//数据库密码
	public static String pwd = "107610";
	//加载驱动
	static {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//获取数据库连接
	public static Connection getConn() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,name,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//关闭数据库连接
	public static void closeConn(Connection conn,ResultSet rs,PreparedStatement pstmt) {
		try {
			if(conn != null) {
				conn.close();
			}
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//测试
	public static void main(String[] args) {
		new DBUtils().getConn();
	}
}
