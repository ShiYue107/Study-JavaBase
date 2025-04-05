package com.gwc.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gwc.Modle.Goods;
import com.gwc.Utils.DBUtils;

//���ڲ������ݿ����
public class GoodsDao {
	Connection conn ;
	ResultSet rs;
	PreparedStatement smt;
	//������ѯ����
	public List<Goods> queryAll(){
		//�������ݿ�����
		conn=DBUtils.getConn();
		//��дsql
		String sql="select * from tb_gwc";
		//����sql
		try {
			smt=conn.prepareStatement(sql);
			//ִ��sql
			rs=smt.executeQuery();
			//��������
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
	//����
	public static void main(String[] args) {
		List<Goods> list=new GoodsDao().queryAll();
		for (Goods goods : list) {
			System.out.println(goods);
		}
	}
}
