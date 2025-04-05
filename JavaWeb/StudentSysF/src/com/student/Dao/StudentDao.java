package com.student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.Model.Student;
import com.student.Model.User;
import com.student.Utils.DBUtils;

public class StudentDao {
	Connection conn =null;
	ResultSet rs=null;
	PreparedStatement smt=null;
	public List<Student> queryAll(){
		conn=DBUtils.getConn();
		String sql="select * from tb_student";
		try {
			smt=conn.prepareStatement(sql);
			rs=smt.executeQuery();
			List<Student> stuList=new ArrayList<Student>();
			if (rs!=null) {
				while (rs.next()) {
					stuList.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getString("gender"),
								rs.getInt("age"),rs.getString("tel"),rs.getString("address")));
				}
			}
			return stuList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return null;
	}
	public boolean addStudent(Student stu) {
		conn=DBUtils.getConn();
		String sql="insert into tb_student values(null,?,?,?,?,?)";
		try {
			smt=conn.prepareStatement(sql);
			smt.setString(1, stu.getName());
			smt.setString(2, stu.getGender());
			smt.setInt(3, stu.getAge());
			smt.setString(4, stu.getTel());
			smt.setString(5, stu.getAddress());
			int result=smt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return false;
	}
}
