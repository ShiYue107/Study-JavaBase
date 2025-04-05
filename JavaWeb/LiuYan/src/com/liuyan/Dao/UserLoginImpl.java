package com.liuyan.Dao;

import java.awt.image.DataBuffer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.liuyan.Utils.DBUtils;
import com.liuyan.model.Login;

//  implements--��  impl   ���ݲ�
public class UserLoginImpl implements LoginDao{
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement smt = null;
	@Override//�û���¼
	public Login userLogin(String name, String password) {
		conn = DBUtils.getConn();//�������ݿ�����
		String sql = "select  * from login  where name=? and password = ?";
		try {
			smt = conn.prepareStatement(sql);
			smt.setString(1, name);
			smt.setString(2, password);
			//ִ��sql
			rs = smt.executeQuery();
			if(rs!=null && rs.next()) {
				Login l = new Login();
				l.setId(rs.getInt("id"));
				l.setName(rs.getString("name"));
				l.setPassword(rs.getString("password"));
				l.setRole(rs.getInt("role"));
				return l;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return null;
	}

	@Override//�û���ע�Ṧ��
	public boolean UserRegister(Login login) {
		conn = DBUtils.getConn();
		String sql = "insert into login values(null,?,?,?)";
		try {
			smt = conn.prepareStatement(sql);
			//Ϊռλ����ֵ
			smt.setString(1, login.getName());
			smt.setString(2, login.getPassword());
			smt.setInt(3, login.getRole());
			//ִ��sql
			int result = smt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return false;
	}

	@Override
	public Boolean deleteUser(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
