package com.mhys.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mhys.DBConn.DBUitls;

/**
 * 
 * @author ZhangFeng
 *	该类是数据库主要操作类Dao层
 */
public class StudentDao {
	static ResultSet rs;
	static Connection conn;
	static PreparedStatement pstmt;
	//增
	public static boolean addStudent(Student std) {
		//获取数据库连接
		conn=DBUitls.getConn();
		//书写SQL
		String sql="insert into tb_student value(null,?,?,?)";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setString(1, std.getName());
			pstmt.setString(2, std.getCardID());
			pstmt.setDate(3, new Date(std.getDate().getTime()));
			//执行SQL
			int result=pstmt.executeUpdate();
			if (result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//关闭数据库
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return false;
	}
	//查询单条信息
	public static Student queryOne(int id) {
		//获取数据库连接
		conn=DBUitls.getConn();
		//书写SQL
		String sql="select * from tb_student where id=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, id);
			//执行SQL
			rs=pstmt.executeQuery();
			if (rs!=null&&rs.next()) {
				return new Student(rs.getInt("id"),
									rs.getString("name"),
									rs.getString("cardID"),
									rs.getDate("date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//关闭数据库资源
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return null;
	}
	//删 通过id删除
	public static boolean delet(int id) {
		//获取数据库连接
		conn = DBUitls.getConn();
		//书写SQL
		String sql="delete from tb_student where id=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, id);
			//执行SQL
			int result =pstmt.executeUpdate();
			if (result>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//关闭数据库资源
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//改
	public static boolean update(Student std) {
		//获取数据库连接
		conn = DBUitls.getConn();
		//书写SQL
		String sql="update tb_student set name=?,cardID=?,date=? where id=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setString(1, std.getName());
			pstmt.setString(2, std.getCardID());
			pstmt.setDate(3,new Date(std.getDate().getTime()));
			pstmt.setInt(4, std.getId());
			//执行SQL
			int result=pstmt.executeUpdate();
			if (result>0) {
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//关闭数据库资源
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//查
	public static List<Student> queryAll(){
		//获取数据库连接
		conn = DBUitls.getConn();
		//书写SQL
		String sql="select * from tb_student";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//执行SQL
			rs=pstmt.executeQuery();
			if (rs!=null) {
				List<Student> list=new ArrayList<>();
				while (rs.next()) {
					list.add(new Student(
							rs.getInt("id"),
							rs.getString("name"),
							rs.getString("cardID"),
							rs.getDate("date")
							));
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//关闭数据库
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return null;
	}
	//测试
	public static void main(String[] args) {
		List<Student> list=new StudentDao().queryAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
