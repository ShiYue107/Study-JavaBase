package com.liuyan.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {
	private static final String URL = "jdbc:mysql://localhost:3306/luiyandb";
	private static final String USER = "root";
	private static final String PASSWORD = "107115";
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// �������ݿ�

	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(123);
			return conn;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
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
	public static void main(String[] args) {
		new DBUtils().getConn();
	}
}
