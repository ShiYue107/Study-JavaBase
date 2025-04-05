package com.zf.DBUtils;
/**
 * 
 * @author Administrator
 *	���������ݿ����ӵ���Ҫ��
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	//������
	static final String DRIVER="com.mysql.jdbc.Driver";
	//���ݿ�·��
	static final String URL="jdbc:mysql://localhost:3306/db_class";
	//���ݿ��û���
	static final String NAME="root";
	//���ݿ�����
	static final String PWD="107115";
	
	//��������
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//��ȡ���ݿ�����
	public static Connection getConn() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, NAME, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//���ݿ���Դ�ر�
	public static void connClose(ResultSet rs,Connection conn,PreparedStatement pstmt) {
		try {
			if(rs!=null)
				rs.close();
			if(conn!=null)
				conn.close();
			if(pstmt!=null)
				pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
