package com.zf.DBUtils;
/**
 * 
 * @author Administrator
 *	该类是数据库连接的主要类
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	//驱动类
	static final String DRIVER="com.mysql.jdbc.Driver";
	//数据库路径
	static final String URL="jdbc:mysql://localhost:3306/db_class";
	//数据库用户名
	static final String NAME="root";
	//数据库密码
	static final String PWD="107115";
	
	//加载驱动
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//获取数据库连接
	public static Connection getConn() {
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(URL, NAME, PWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//数据库资源关闭
	public static void connClose(ResultSet rs,Connection conn,PreparedStatement pstmt) {
		try {
			if(rs!=null)
				rs.close();
			if(conn!=null)
				conn.close();
			if(pstmt!=null)
				pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
