package com.dao;
//该类是数据库的主要操作类
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

	// 查询所有
	public List<Vip> querAll() {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写sql语句
		String sql = "select * from members";
		try {
			// 管理SQL
			pstmt = conn.prepareStatement(sql);
			// 创建Vip集合
			List<Vip> list = new ArrayList<Vip>();
			// 执行SQL
			rs = pstmt.executeQuery();
			// 处理结果集
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
		} finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return null;
	}

	// 删除 通过id
	public boolean delVipById(int id) {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写sql语句
		String sql = "delete from members where memberid=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给问号赋值
			pstmt.setInt(1, id);
			//执行SQL
			int result=pstmt.executeUpdate();
			if(result>0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}

	// 测试
	public static void main(String[] args) {
//		List<Vip> list = new VipDao().querAll();
//		for (Vip vip : list) {
//			System.out.println(vip);
//		}
		boolean flag=new VipDao().delVipById(3);
		System.out.println(flag);
	}
}
