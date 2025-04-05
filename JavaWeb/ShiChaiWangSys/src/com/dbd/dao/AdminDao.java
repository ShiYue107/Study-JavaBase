package com.dbd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbd.Utils.DBUtils;
import com.dbd.pojo.Admin;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021��5��24�� ����10:59:17
* @version 1.0
* ��˵��
*/
public class AdminDao {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	public static Admin adminLogin(String username,String password) {
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		//��дsql���
		String sql = "select * from admininfo where userName=? and password=?";
		try {
			//����pstmt������
			pstmt = conn.prepareStatement(sql);
			//��ֵ
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			//ִ��sql
			rs = pstmt.executeQuery();
			//��������
			if (rs != null && rs.next()) {
				return new Admin(rs.getInt("id"),rs.getString("username"),rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return null;
	}
}
