package com.zf.Dao;
/**
 * 
 * @author Administrator
 *	���������ݿ���Ҫ������
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zf.DBUtils.DBConn;

public class ClassDao {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;
	
	//��
	public boolean addClass(Classs cs) {
		//��ȡ���ݿ�����
		conn=DBConn.getConn();
		//��дSQL
		String sql="insert into tb_class values(?,?,?,?,?,?,?)";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, cs.getId());
			pstmt.setString(2, cs.getName());
			pstmt.setString(3, cs.getSex());
			pstmt.setString(4, cs.getPost());
			pstmt.setString(5,cs.getIdcard());
			pstmt.setDouble(6, cs.getBalance());
			pstmt.setDate(7, (new Date(cs.getCreateDate().getTime())));
			//ִ��SQL
			int result=pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//�ر����ݿ���Դ
			DBConn.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//ɾ ͨ��idɾ��
	public boolean deleClass(int id) {
		//��ȡ���ݿ�����
		conn=DBConn.getConn();
		//��дSQL
		String sql="delete from tb_class where id=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��SQL 
			int result =pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//�ر����ݿ���Դ
			DBConn.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//��
	public boolean updateClass(Classs cs) {
		//��ȡ���ݿ�����
		conn=DBConn.getConn();
		//��дSQL
		String sql="update tb_class set name=?,sex=?,post=?,idcard=?,balance=?,createDate=? where id=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, cs.getName());
			pstmt.setString(2,cs.getSex());
			pstmt.setString(3, cs.getPost());
			pstmt.setString(4, cs.getIdcard());
			pstmt.setDouble(5, cs.getBalance());
			pstmt.setDate(6, (new Date(cs.getCreateDate().getTime())));
			pstmt.setInt(7, cs.getId());
			//ִ��SQL
			int result =pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//�ر����ݿ���Դ
			DBConn.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//�� ȫ��
	public List<Classs> queryAll(){
		//��ȡ���ݿ�����
		conn=DBConn.getConn();
		//��дSQL
		String sql="select * from tb_class";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//����List����
			List<Classs> list =new ArrayList<>();
			//ִ��SQL
			rs=pstmt.executeQuery();
			//��������
			if (rs!=null) {
				while(rs.next()) {
					list.add(new Classs(
							rs.getInt("id"),
							rs.getString("name"), 
							rs.getString("sex"), 
							rs.getString("post"), 
							rs.getString("idcard"), 
							rs.getDouble("balance"),
							rs.getDate("createDate")));
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {//�ر����ݿ���Դ
			DBConn.connClose(rs, conn, pstmt);
		}
		return null;
	}
	
	//�� ����
	public Classs queryOne(int id) {
		//��ȡ���ݿ�����
		conn=DBConn.getConn();
		//��дSQL
		String sql="select * from tb_class where id=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��SQL
			rs=pstmt.executeQuery();
			if (rs!=null&&rs.next()) {
				Classs sc=new Classs(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("sex"),
						rs.getString("post"),
						rs.getString("idcard"),
						rs.getDouble("balance"),
						rs.getDate("createDate"));
				return sc;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//�ر����ݿ���Դ
			DBConn.connClose(rs, conn, pstmt);
		}
		return null;
	}
	//����
	public static void main(String[] args) {
//		List<Class> list=new ClassDao().queryAll();
//		for (Class class1 : list) {
//			System.out.println(class1);
//		}
		Classs cs=new ClassDao().queryOne(3);
		System.out.println(cs);
	}
}
