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
 *	���������ݿ���Ҫ������Dao��
 */
public class StudentDao {
	static ResultSet rs;
	static Connection conn;
	static PreparedStatement pstmt;
	//��
	public static boolean addStudent(Student std) {
		//��ȡ���ݿ�����
		conn=DBUitls.getConn();
		//��дSQL
		String sql="insert into tb_student value(null,?,?,?)";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, std.getName());
			pstmt.setString(2, std.getCardID());
			pstmt.setDate(3, new Date(std.getDate().getTime()));
			//ִ��SQL
			int result=pstmt.executeUpdate();
			if (result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ر����ݿ�
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return false;
	}
	//��ѯ������Ϣ
	public static Student queryOne(int id) {
		//��ȡ���ݿ�����
		conn=DBUitls.getConn();
		//��дSQL
		String sql="select * from tb_student where id=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��SQL
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
		//�ر����ݿ���Դ
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return null;
	}
	//ɾ ͨ��idɾ��
	public static boolean delet(int id) {
		//��ȡ���ݿ�����
		conn = DBUitls.getConn();
		//��дSQL
		String sql="delete from tb_student where id=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��SQL
			int result =pstmt.executeUpdate();
			if (result>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�ر����ݿ���Դ
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//��
	public static boolean update(Student std) {
		//��ȡ���ݿ�����
		conn = DBUitls.getConn();
		//��дSQL
		String sql="update tb_student set name=?,cardID=?,date=? where id=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, std.getName());
			pstmt.setString(2, std.getCardID());
			pstmt.setDate(3,new Date(std.getDate().getTime()));
			pstmt.setInt(4, std.getId());
			//ִ��SQL
			int result=pstmt.executeUpdate();
			if (result>0) {
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�ر����ݿ���Դ
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//��
	public static List<Student> queryAll(){
		//��ȡ���ݿ�����
		conn = DBUitls.getConn();
		//��дSQL
		String sql="select * from tb_student";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//ִ��SQL
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
		//�ر����ݿ�
		finally {
			DBUitls.connClose(rs, conn, pstmt);
		}
		return null;
	}
	//����
	public static void main(String[] args) {
		List<Student> list=new StudentDao().queryAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
