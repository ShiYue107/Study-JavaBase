package com.FanXiao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	
	//���ݿ�����	com.mysql.jdbc.Driver.class
	public static String driver = "com.mysql.jdbc.Driver" ;
	//���ݿ�·��
	public static String url = "jdbc:mysql://localhost:3306/db_fanxiao";
	//���ݿ��û���
	public static String name = "root";
	//���ݿ�����
	public static String pwd = "107610";
	//��������
	static {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	//��ȡ���ݿ�����
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
	//�ر����ݿ�����
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
	//����
	public static void main(String[] args) {
		new DBUtils().getConn();
	}
}
