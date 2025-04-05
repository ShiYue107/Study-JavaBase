package com.zf.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	
	//数据库驱动
	public final static String DRIVER = "com.mysql.jdbc.Driver";
	//数据库连接路径
	public final static String URL = "jdbc:mysql://localhost:3306/dianzigg_db";
	//数据库用户名
	public final static String DBNAME = "root";
	//数据库密码
	public final static String DBPASS = "107610";
	
	//加载驱动
	public Connection getConn() {
		try {
			Class.forName(DRIVER);
			//获取数据连接
			Connection conn=DriverManager.getConnection(URL,DBNAME,DBPASS);
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	//关闭数据库资源
	public void closeConn(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	
	//执行SQL 进行增 删 改操作
	public int executeSQL(String preparedSql,String[] parm) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			conn = getConn();
			pstmt = conn.prepareStatement(preparedSql);
			if(parm != null) {
				for (int i = 0; i < parm.length; i++) {
					pstmt.setString(i+1,parm[i]);//为预编译SQL设置参数
				}
			}
			num = pstmt.executeUpdate();//执行SQL语句
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeConn(conn, pstmt, null);
		}
		return num;
	}
	public static void main(String[] args) {
		new BaseDao().getConn();
	}
}
