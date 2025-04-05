package com.zf.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
	//���ݿ�����
	public final static String DRIVER = "com.mysql.jdbc.Driver";
	//���ݿ�����·��
	public final static String URL = "jdbc:mysql://localhost:3306/dianzigg_db";
	//���ݿ��û���
	public final static String DBNAME = "root";
	//���ݿ�����
	public final static String DBPASS = "107610";
	
	//��������
	public Connection getConn() {
		try {
			Class.forName(DRIVER);
			//��ȡ��������
			Connection conn=DriverManager.getConnection(URL,DBNAME,DBPASS);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//�ر����ݿ���Դ
	public void closeConn(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	//ִ��SQL ������ ɾ �Ĳ���
	public int executeSQL(String preparedSql,String[] parm) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			conn = getConn();
			pstmt = conn.prepareStatement(preparedSql);
			if(parm != null) {
				for (int i = 0; i < parm.length; i++) {
					pstmt.setString(i+1,parm[i]);//ΪԤ����SQL���ò���
				}
			}
			num = pstmt.executeUpdate();//ִ��SQL���
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeConn(conn, pstmt, null);
		}
		return num;
	}
	public static void main(String[] args) {
		new BaseDao().getConn();
	}
}
