package com.dbd.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbd.Utils.DBUtils;
import com.dbd.pojo.Project;

/**
* @author IT_Koma
* @date 2021��5��26�� ����12:53:53
* @version 1.0
* ��˵��
*/
public class ProjectDao {
	
	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	//��ѯ���е���Ŀ
	public static List<Project> queryAllPrj(){
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		//��дsql���
		String sql = "select * from project";
		try {
			//����pstmt
			pstmt = conn.prepareStatement(sql);
			//ִ��sql
			rs = pstmt.executeQuery();
			//��������
			if (rs != null) {
				List<Project> list = new ArrayList<Project>();
				while (rs.next()) {
					list.add(new Project(rs.getInt("id"),rs.getString("projectName"),
							rs.getString("projectContent"), rs.getInt("userId"), rs.getDate("creatDate"),
							rs.getDouble("money")));
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
	
	//������Ŀ
	public static int addPrj(Project prj) {
		//��ȡ���ݿ�����
		conn = DBUtils.getConn();
		//��дsql���
		String sql = "insert into project values(0,?,?,?,?,?)";
		try {
			//����pstmt
			pstmt = conn.prepareStatement(sql);
			//��ֵ
			pstmt.setString(1, prj.getProjectName());
			pstmt.setString(2, prj.getProjectContent());
			pstmt.setInt(3, prj.getUserId());
			pstmt.setDate(4, new Date(prj.getCreatDate().getTime()));
			pstmt.setDouble(5, prj.getMoney());
			//ִ��sql
			int result = pstmt.executeUpdate();
			if (result>0) {
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.closeConn(conn, pstmt, rs);
		}
		return 0;
	}
}
