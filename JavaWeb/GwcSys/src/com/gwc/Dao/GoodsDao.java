package com.gwc.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gwc.Modle.Goods;
import com.gwc.Utils.DBUtils;

//用于操作数据库的类
public class GoodsDao {
	Connection conn ;
	ResultSet rs;
	PreparedStatement smt;
	//创建查询方法
	public List<Goods> queryAll(){
		//建立数据库连接
		conn=DBUtils.getConn();
		//书写sql
		String sql="select * from tb_gwc";
		//管理sql
		try {
			smt=conn.prepareStatement(sql);
			//执行sql
			rs=smt.executeQuery();
			//处理结果集
			if(rs!=null) {
				List<Goods> list=new ArrayList<Goods>();
				while (rs.next()) {
					list.add(new Goods(rs.getInt("id"),
							rs.getString("name"),
							rs.getDouble("price"),
							rs.getDate("createTime"),
							rs.getString("desc")));
				}
				return list;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.CloseConn(conn, rs, smt);
		}
		return null;
	}
	//测试
	public static void main(String[] args) {
		List<Goods> list=new GoodsDao().queryAll();
		for (Goods goods : list) {
			System.out.println(goods);
		}
	}
}
