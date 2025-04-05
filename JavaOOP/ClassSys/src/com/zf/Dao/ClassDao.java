package com.zf.Dao;
/**
 * 
 * @author Administrator
 *	该类是数据库主要操作类
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
	
	//增
	public boolean addClass(Classs cs) {
		//获取数据库连接
		conn=DBConn.getConn();
		//书写SQL
		String sql="insert into tb_class values(?,?,?,?,?,?,?)";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, cs.getId());
			pstmt.setString(2, cs.getName());
			pstmt.setString(3, cs.getSex());
			pstmt.setString(4, cs.getPost());
			pstmt.setString(5,cs.getIdcard());
			pstmt.setDouble(6, cs.getBalance());
			pstmt.setDate(7, (new Date(cs.getCreateDate().getTime())));
			//执行SQL
			int result=pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//关闭数据库资源
			DBConn.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//删 通过id删除
	public boolean deleClass(int id) {
		//获取数据库连接
		conn=DBConn.getConn();
		//书写SQL
		String sql="delete from tb_class where id=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, id);
			//执行SQL 
			int result =pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//关闭数据库资源
			DBConn.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//改
	public boolean updateClass(Classs cs) {
		//获取数据库连接
		conn=DBConn.getConn();
		//书写SQL
		String sql="update tb_class set name=?,sex=?,post=?,idcard=?,balance=?,createDate=? where id=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setString(1, cs.getName());
			pstmt.setString(2,cs.getSex());
			pstmt.setString(3, cs.getPost());
			pstmt.setString(4, cs.getIdcard());
			pstmt.setDouble(5, cs.getBalance());
			pstmt.setDate(6, (new Date(cs.getCreateDate().getTime())));
			pstmt.setInt(7, cs.getId());
			//执行SQL
			int result =pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {//关闭数据库资源
			DBConn.connClose(rs, conn, pstmt);
		}
		return false;
	}
	
	//查 全部
	public List<Classs> queryAll(){
		//获取数据库连接
		conn=DBConn.getConn();
		//书写SQL
		String sql="select * from tb_class";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//创建List集合
			List<Classs> list =new ArrayList<>();
			//执行SQL
			rs=pstmt.executeQuery();
			//处理结果集
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
		}finally {//关闭数据库资源
			DBConn.connClose(rs, conn, pstmt);
		}
		return null;
	}
	
	//查 单条
	public Classs queryOne(int id) {
		//获取数据库连接
		conn=DBConn.getConn();
		//书写SQL
		String sql="select * from tb_class where id=?";
		try {
			//管理SQL
			pstmt=conn.prepareStatement(sql);
			//给？赋值
			pstmt.setInt(1, id);
			//执行SQL
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
		finally {//关闭数据库资源
			DBConn.connClose(rs, conn, pstmt);
		}
		return null;
	}
	//测试
	public static void main(String[] args) {
//		List<Class> list=new ClassDao().queryAll();
//		for (Class class1 : list) {
//			System.out.println(class1);
//		}
		Classs cs=new ClassDao().queryOne(3);
		System.out.println(cs);
	}
}
