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
* @date 2021年5月26日 下午12:53:53
* @version 1.0
* 类说明
*/
public class ProjectDao {
	
	static Connection conn;
	static ResultSet rs;
	static PreparedStatement pstmt;
	
	//查询所有的项目
	public static List<Project> queryAllPrj(){
		//获取数据库连接
		conn = DBUtils.getConn();
		//书写sql语句
		String sql = "select * from project";
		try {
			//创建pstmt
			pstmt = conn.prepareStatement(sql);
			//执行sql
			rs = pstmt.executeQuery();
			//处理结果集
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
	
	//新增项目
	public static int addPrj(Project prj) {
		//获取数据库连接
		conn = DBUtils.getConn();
		//书写sql语句
		String sql = "insert into project values(0,?,?,?,?,?)";
		try {
			//创建pstmt
			pstmt = conn.prepareStatement(sql);
			//赋值
			pstmt.setString(1, prj.getProjectName());
			pstmt.setString(2, prj.getProjectContent());
			pstmt.setInt(3, prj.getUserId());
			pstmt.setDate(4, new Date(prj.getCreatDate().getTime()));
			pstmt.setDouble(5, prj.getMoney());
			//执行sql
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
