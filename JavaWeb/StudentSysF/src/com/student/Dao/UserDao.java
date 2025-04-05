package com.student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.student.Model.User;
import com.student.Utils.DBUtils;

public class UserDao {
	Connection conn =null;
	ResultSet rs=null;
	PreparedStatement smt=null;
	public User userLogin(String name,String password) {
		conn=DBUtils.getConn();
		String sql="select * from tb_user where name=? and password=?";
		try {
			smt=conn.prepareStatement(sql);
			smt.setString(1, name);
			smt.setString(2, password);
			rs=smt.executeQuery();
			if (rs!=null && rs.next()) {
				return new User(rs.getInt("id"),rs.getString("name"),rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return null;
	}
}
