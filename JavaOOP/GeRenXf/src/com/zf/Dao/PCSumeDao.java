package com.zf.Dao;
/*
 * 该类是数据库的主要操作类Dao
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

	// 查
	public static List<PCSume> queryAll() {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写SQL
		String sql = "select * from tb_xfmx";
		try {
			// 管理SQL
			pstmt = conn.prepareStatement(sql);
			// 执行SQL
			rs = pstmt.executeQuery();
			// 创建PCSume集合
			List<PCSume> list = new ArrayList<PCSume>();
			// 处理结果集
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
		} finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return null;
	}

	// 删 通过id
	public static boolean delById(int id) {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写SQL
		String sql = "delete from tb_xfmx where id=?";
		try {
			// 管理SQL
			pstmt = conn.prepareStatement(sql);
			// 给？赋值
			pstmt.setInt(1, id);
			// 执行SQL
			int rsult = pstmt.executeUpdate();
			if (rsult > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}

	// 查 单条 通过id
	public static PCSume queryOne(int id) {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写SQL
		String sql = "select * from tb_xfmx where id=?";
		try {
			// 管理SQL
			pstmt = conn.prepareStatement(sql);
			// 给？赋值
			pstmt.setInt(1, id);
			// 执行SQL
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
		} finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return null;
	}

	// 改
	public static boolean update(PCSume pcs) {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写SQL
		String sql = "update tb_xfmx set name=?,money=?,date=?,userName=? where id=?";
		try {
			// 管理SQL
			pstmt = conn.prepareStatement(sql);
			// 给？赋值
			pstmt.setString(1, pcs.getName());
			pstmt.setDouble(2, pcs.getMoney());
			pstmt.setDate(3, new Date(pcs.getDate().getTime()));
			pstmt.setString(4, pcs.getUserName());
			pstmt.setInt(5, pcs.getId());
			// 执行SQL
			int rsult = pstmt.executeUpdate();
			if (rsult > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}

	// 增
	public static boolean addPcs(PCSume pcs) {
		// 获取数据库连接
		conn = BaseDao.getConn();
		// 书写SQL
		String sql = "insert into tb_xfmx values(null,?,?,?,?)";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setString(1, pcs.getName());
			pstmt.setDouble(2, pcs.getMoney());
			pstmt.setDate(3,new Date(pcs.getDate().getTime()));
			pstmt.setString(4, pcs.getUserName());
			//执行SQL
			int rsult=pstmt.executeUpdate();
			if(rsult>0) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {// 关闭数据库资源
			BaseDao.connClose(rs, conn, pstmt);
		}
		return false;
	}
}
