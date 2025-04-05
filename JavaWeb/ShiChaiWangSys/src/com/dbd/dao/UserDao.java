package com.dbd.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbd.Utils.DBUtils;
import com.dbd.pojo.User;

/**
* @author IT_Koma
* @date 2021��5��5�� ����3:26:08
* @version 1.0
* ��˵��
* ����Ա�����û���Dao��
*/
public class UserDao {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	//��ѯ�����û�
	public static List<User> queryAll(){
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		//��дsql���
		String sql = "select * from user";
		try {
			//����pstmt������
			pstmt = conn.prepareStatement(sql);
			//ִ��sql
			rs = pstmt.executeQuery();
			//��������
			if (rs != null) {
				List<User> list = new ArrayList<User>();
				while (rs.next()) {
					list.add(new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),
							rs.getString("phone"),rs.getString("mail"),
							rs.getDate("date")));
				}
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return null;
	}
	
	public static User loginOne(String username,String password) {
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		//��дsql���
		String sql = "select * from user where userName=? and password=?";
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
				return new User(rs.getInt("id"),rs.getString("username"),rs.getString("password"),
						rs.getString("phone"),rs.getString("mail"),
						rs.getDate("date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return null;
	}
	
	public static int addUser(User user) {
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
					
		//��дsql
		String sql = "insert into user values(0,?,?,?,?,?)";
		try {
			//����pstmt������
			pstmt = conn.prepareStatement(sql);
			//��ֵ
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getMail());
			pstmt.setString(4, user.getPhone());
			pstmt.setDate(5, new Date(user.getDate().getTime()));
			int result = pstmt.executeUpdate();
			if (result>0) {
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	public static void main(String[] args) {
		List<User> list = new UserDao().queryAll();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
