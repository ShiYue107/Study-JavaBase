package com.student.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {
	private static final String URL = "jdbc:mysql://localhost:3306/db_student";
	private static final String USER = "root";
	private static final String PASSWORD = "107115";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 连接数据库

	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void CloseConn(Connection conn ,ResultSet rs,PreparedStatement smt) {
		try {
			if (conn != null) {
				conn.close();
			}
			if (rs != null) {
				rs.close();
			}
			if (smt != null) {
				smt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
