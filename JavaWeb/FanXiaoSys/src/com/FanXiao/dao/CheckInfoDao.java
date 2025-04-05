package com.FanXiao.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.FanXiao.pojo.CheckInfo;
import com.FanXiao.utils.DBUtils;

public class CheckInfoDao {
	
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	//��ѯ���е�����
	public List<CheckInfo> queryAll(){
		//�������ݿ�
		conn = DBUtils.getConn();
		//��дSQL
		String sql = "select * from tb_checkInfo";
		try {
			//sql������
			pstmt = conn.prepareStatement(sql);
			//ִ��SQL
			rs = pstmt.executeQuery();
			//��������
			if(rs != null) {
				List<CheckInfo> list = new ArrayList<CheckInfo>();
				while (rs.next()) {
					list.add(new CheckInfo(rs.getInt("id"), rs.getString("name"),
							rs.getString("gender"), rs.getString("from"), 
							rs.getDate("returnDAte"), rs.getDate("checkDate"), 
							rs.getString("state")));
				}
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return null;
	} 
	
	
	//ɾ������
	public int delById(int id) {
		//�������ݿ�
		conn = DBUtils.getConn();
		//��дSQL
		String sql = "delete from tb_checkInfo where id=?";
		try {
			//sql������
			pstmt = conn.prepareStatement(sql);
			//������ֵ
			pstmt.setInt(1, id);
			//ִ��SQL
			int result = pstmt.executeUpdate();
			if(result > 0) {
				return 1;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return 0;
	}
	
	
	//��������
	public int addCheckInfo(CheckInfo ci) {
		//�������ݿ�
		conn = DBUtils.getConn();
		//��дSQL
		String sql = "INSERT INTO tb_checkinfo VALUES(0,?,?,?,?,?,?) ";
		try {
			//SQL������
			pstmt = conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, ci.getName());
			pstmt.setString(2, ci.getGender());
			pstmt.setString(3, ci.getFrom());
			pstmt.setDate(4,new Date(ci.getReturnDate().getTime()));
			pstmt.setDate(5, new Date(ci.getCheckDate().getTime()));
			pstmt.setString(6, ci.getState());
			//ִ��SQL
			int result = pstmt.executeUpdate();
			if(result > 0) {
				return 1;
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
