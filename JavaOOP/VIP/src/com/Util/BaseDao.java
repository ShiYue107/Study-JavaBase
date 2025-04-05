package com.Util;
/*
 * �����������ݿ�Ĺ�����
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	//���ݿ�����
	static final String  DRIVER="com.mysql.jdbc.Driver";
	//���ݿ��û���
	static final String USRENAME="root";
	//���ݿ�����
	static final String PWD="107115";
	//���ݿ�·��
	static final String URL="jdbc:mysql://localhost:3306/MemberDB";
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
			conn=DriverManager.getConnection(URL, USRENAME, PWD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//�ر����ݿ���Դ
	public static void connClose(ResultSet rs,Connection conn,PreparedStatement pstmt) {
		try {
			if(rs!=null) {
				rs.close();
			}
			if (conn!=null) {
				conn.close();
			}
			if (pstmt!=null) {
				pstmt.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//����
	public static void main(String[] args) {
		new BaseDao().getConn();
	}
}
