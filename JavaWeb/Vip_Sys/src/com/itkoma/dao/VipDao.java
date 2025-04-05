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
	
	//查询所有
	public List<Vip> queryAll(String name,String gender){
		//获取数据库连接
		conn = DBUtils.getConn();
		
		//书写sql
//		String sql = "select * from tb_vip";
		StringBuffer sql = new StringBuffer("select * from tb_vip where 1=1");
		
		if (name != null || !"".equals(name)) {
			sql.append(" and name like '%"+name+"%'");
		}
		if (gender != null || !"".equals(gender)) {
			sql.append(" and gender like '%"+gender+"%'");
		}
		try {
			//创建sql管理器
			pstmt = conn.prepareStatement(sql.toString());
			
			//执行sql
			rs = pstmt.executeQuery();
			
			//处理结果集
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
		}finally {//关闭数据库资源
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return null;
	}

	
	//新增用户
	public int addVip(Vip vip) {
		//获取数据库连接
		conn = DBUtils.getConn();
				
		//书写sql
		String sql = "insert into tb_vip values(?,?,?,?,?,?)";
				
		try {
			//创建sql管理器
			pstmt = conn.prepareStatement(sql);
			
			//给占位符赋值
			pstmt.setInt(1, vip.getId());
			pstmt.setString(2, vip.getPhone());
			pstmt.setString(3, vip.getName());
			pstmt.setString(4, vip.getGender());
			pstmt.setDate(5, new Date(vip.getOpenDate().getTime()));
			pstmt.setDouble(6, vip.getBalance());
			//执行sql
			int result = pstmt.executeUpdate();
		
			if(result > 0) {
				System.out.println("数据添加成功！");
				return result;
			}
					
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//关闭数据库资源
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return 0;
	}
	
	
	//删除用户
	public int deleteVip(int id) {
		
		//获取数据库连接
		conn = DBUtils.getConn();
		
		//书写sql
		String sql = "delete from tb_vip where id = ?";
		
		try {
			//获取sql管理器
			pstmt = conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, id);
			//执行sql
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("数据删除成功！");
				return result;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//关闭数据库资源
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return 0;
	}

	
	//查询单条数据
	public Vip findOneById(int id) {
		//获取数据库连接
		conn = DBUtils.getConn();
		
		//书写sql
		String sql = "select * from tb_vip where id=?";
		
		try {
			//创建sql管理器
			pstmt = conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, id);
			//执行sql
			rs = pstmt.executeQuery();
			//处理结果集
			if (rs != null && rs.next()) {
				return new Vip(rs.getInt("id"), rs.getString("phone"),
					rs.getString("name"), rs.getString("gender"), 
					rs.getDate("openDate"), rs.getDouble("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//关闭数据库资源
			DBUtils.closeConn(conn, rs, pstmt);
		}
		return null;
	}
	
	
	public int updateVip(Vip vip) {
		//获取sql
		conn = DBUtils.getConn();
		
		//书写sql
		String sql = "update tb_vip set phone=?,name=?,gender=?,openDate=?,balance=? where id =?";
		
		try {
			//创建sql管理器
			pstmt = conn.prepareStatement(sql);
			//给？赋值
			pstmt.setString(1, vip.getPhone());
			pstmt.setString(2, vip.getName());
			pstmt.setString(3, vip.getGender());
			pstmt.setDate(4, new Date(vip.getOpenDate().getTime()));
			pstmt.setDouble(5, vip.getBalance());
			pstmt.setInt(6, vip.getId());
			//执行sql
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("数据库修改成功！");
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
