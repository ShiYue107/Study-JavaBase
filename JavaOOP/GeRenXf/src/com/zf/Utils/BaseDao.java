package com.zf.Utils;
/*
 * ���������ݿ����ӵĹ�����
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
	
	//����
	static final String DRIVER="com.mysql.jdbc.Driver";
	//���ݿ�·��
	static final String URL="jdbc:mysql://localhost:3306/grxfdb";
	//���ݿ��û���
	static final String NAME="root";
	//���ݿ�����
	static final String PWD="107610";
	//��������
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//��ȡ���ݿ�����
	public static Connection getConn() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, NAME, PWD);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//�ر����ݿ���Դ
	public static void connClose(ResultSet rs,Connection conn,PreparedStatement pstmt) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(conn!=null) {
				conn.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
