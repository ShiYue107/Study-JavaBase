package com.dao;
//���������ݿ����Ҫ������
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Util.BaseDao;

public class VipDao {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;

	// ��ѯ����
	public List<Vip> querAll() {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дsql���
		String sql = "select * from members";
		try {
			// ����SQL
			pstmt = conn.prepareStatement(sql);
			// ����Vip����
			List<Vip> list = new ArrayList<Vip>();
			// ִ��SQL
			rs = pstmt.executeQuery();
			// ��������
			if (rs != null) {
				while (rs.next()) {
					list.add(new Vip(rs.getInt("memberid"), rs.getString("phone"), rs.getString("name"),
							rs.getString("sex"), rs.getDate("openDate"), rs.getDouble("balance")));
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

	// ɾ�� ͨ��id
	public boolean delVipById(int id) {
		// ��ȡ���ݿ�����
		conn = BaseDao.getConn();
		// ��дsql���
		String sql = "delete from members where memberid=?";
		try {
			//����SQL
			pstmt=conn.prepareStatement(sql);
			//���ʺŸ�ֵ
			pstmt.setInt(1, id);
			//ִ��SQL
			int result=pstmt.executeUpdate();
			if(result>0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {// �ر����ݿ���Դ
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}

	// ����
	public static void main(String[] args) {
//		List<Vip> list = new VipDao().querAll();
//		for (Vip vip : list) {
//			System.out.println(vip);
//		}
		boolean flag=new VipDao().delVipById(3);
		System.out.println(flag);
	}
}
