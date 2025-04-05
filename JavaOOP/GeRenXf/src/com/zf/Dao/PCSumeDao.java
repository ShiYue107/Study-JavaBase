package com.zf.Dao;
/*
 * ���������ݿ����Ҫ������Dao
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zf.Utils.BaseDao;

public class PCSumeDao {
	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;

	// ��
	public static List<PCSume> queryAll() {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дSQL
		String sql = "select * from tb_xfmx";
		try {
			// ����SQL
			pstmt = conn.prepareStatement(sql);
			// ִ��SQL
			rs = pstmt.executeQuery();
			// ����PCSume����
			List<PCSume> list = new ArrayList<PCSume>();
			// ��������
			if (rs != null) {
				while (rs.next()) {
					list.add(new PCSume(rs.getInt("id"), rs.getString("name"), rs.getDouble("money"),
							rs.getDate("date"), rs.getString("userName")));
				}
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// �ر����ݿ���Դ
			BaseDao.connClose(rs, conn, pstmt);
		}
		return null;
	}

	// ɾ ͨ��id
	public static boolean delById(int id) {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дSQL
		String sql = "delete from tb_xfmx where id=?";
		try {
			// ����SQL
			pstmt = conn.prepareStatement(sql);
			// ������ֵ
			pstmt.setInt(1, id);
			// ִ��SQL
			int rsult = pstmt.executeUpdate();
			if (rsult > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// �ر����ݿ���Դ
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}

	// �� ���� ͨ��id
	public static PCSume queryOne(int id) {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дSQL
		String sql = "select * from tb_xfmx where id=?";
		try {
			// ����SQL
			pstmt = conn.prepareStatement(sql);
			// ������ֵ
			pstmt.setInt(1, id);
			// ִ��SQL
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					return new PCSume(rs.getInt("id"), rs.getString("name"), rs.getDouble("money"), rs.getDate("date"),
							rs.getString("userName"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// �ر����ݿ���Դ
			BaseDao.connClose(rs, conn, pstmt);
		}
		return null;
	}

	// ��
	public static boolean update(PCSume pcs) {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дSQL
		String sql = "update tb_xfmx set name=?,money=?,date=?,userName=? where id=?";
		try {
			// ����SQL
			pstmt = conn.prepareStatement(sql);
			// ������ֵ
			pstmt.setString(1, pcs.getName());
			pstmt.setDouble(2, pcs.getMoney());
			pstmt.setDate(3, new Date(pcs.getDate().getTime()));
			pstmt.setString(4, pcs.getUserName());
			pstmt.setInt(5, pcs.getId());
			// ִ��SQL
			int rsult = pstmt.executeUpdate();
			if (rsult > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// �ر����ݿ���Դ
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}

	// ��
	public static boolean addPcs(PCSume pcs) {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дSQL
		String sql = "insert into tb_xfmx values(null,?,?,?,?)";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//������ֵ
			pstmt.setString(1, pcs.getName());
			pstmt.setDouble(2, pcs.getMoney());
			pstmt.setDate(3,new Date(pcs.getDate().getTime()));
			pstmt.setString(4, pcs.getUserName());
			//ִ��SQL
			int rsult=pstmt.executeUpdate();
			if(rsult>0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// �ر����ݿ���Դ
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}
}
