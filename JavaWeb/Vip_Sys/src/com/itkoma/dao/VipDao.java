package com.itkoma.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itkoma.model.Vip;
import com.itkoma.utils.DBUtils;

public class VipDao {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	//��ѯ����
	public List<Vip> queryAll(String name,String gender){
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		
		//��дsql
//		String sql = "select * from tb_vip";
		StringBuffer sql = new StringBuffer("select * from tb_vip where 1=1");
		
		if (name != null || !"".equals(name)) {
			sql.append(" and name like '%"+name+"%'");
		}
		if (gender != null || !"".equals(gender)) {
			sql.append(" and gender like '%"+gender+"%'");
		}
		try {
			//����sql������
			pstmt = conn.prepareStatement(sql.toString());
			
			//ִ��sql
			rs = pstmt.executeQuery();
			
			//��������
			if (rs != null) {
				List<Vip> list = new ArrayList<Vip>();
				while (rs.next()) {
					list.add(new Vip(rs.getInt("id"),
							         rs.getString("phone"),
							         rs.getString("name"),
							         rs.getString("gender"),
							         rs.getDate("openDate"),
							         rs.getDouble("balance")));
				}
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//�ر����ݿ���Դ
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return null;
	}

	
	//�����û�
	public int addVip(Vip vip) {
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
				
		//��дsql
		String sql = "insert into tb_vip values(?,?,?,?,?,?)";
				
		try {
			//����sql������
			pstmt = conn.prepareStatement(sql);
			
			//��ռλ����ֵ
			pstmt.setInt(1, vip.getId());
			pstmt.setString(2, vip.getPhone());
			pstmt.setString(3, vip.getName());
			pstmt.setString(4, vip.getGender());
			pstmt.setDate(5, new Date(vip.getOpenDate().getTime()));
			pstmt.setDouble(6, vip.getBalance());
			//ִ��sql
			int result = pstmt.executeUpdate();
		
			if(result > 0) {
				System.out.println("������ӳɹ���");
				return result;
			}
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//�ر����ݿ���Դ
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return 0;
	}
	
	
	//ɾ���û�
	public int deleteVip(int id) {
		
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		
		//��дsql
		String sql = "delete from tb_vip where id = ?";
		
		try {
			//��ȡsql������
			pstmt = conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��sql
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("����ɾ���ɹ���");
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//�ر����ݿ���Դ
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return 0;
	}

	
	//��ѯ��������
	public Vip findOneById(int id) {
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		
		//��дsql
		String sql = "select * from tb_vip where id=?";
		
		try {
			//����sql������
			pstmt = conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��sql
			rs = pstmt.executeQuery();
			//��������
			if (rs != null && rs.next()) {
				return new Vip(rs.getInt("id"), rs.getString("phone"),
					rs.getString("name"), rs.getString("gender"), 
					rs.getDate("openDate"), rs.getDouble("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//�ر����ݿ���Դ
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return null;
	}
	
	
	public int updateVip(Vip vip) {
		//��ȡsql
		conn = DBUtils.getConn();
		
		//��дsql
		String sql = "update tb_vip set phone=?,name=?,gender=?,openDate=?,balance=? where id =?";
		
		try {
			//����sql������
			pstmt = conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, vip.getPhone());
			pstmt.setString(2, vip.getName());
			pstmt.setString(3, vip.getGender());
			pstmt.setDate(4, new Date(vip.getOpenDate().getTime()));
			pstmt.setDouble(5, vip.getBalance());
			pstmt.setInt(6, vip.getId());
			//ִ��sql
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("���ݿ��޸ĳɹ���");
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return 0;
	}
}
