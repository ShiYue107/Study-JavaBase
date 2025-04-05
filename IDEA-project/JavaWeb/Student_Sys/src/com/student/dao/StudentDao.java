package com.student.dao;

import com.student.pojo.Student;
import com.student.utlis.DBUtlis;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: 数据库操作的主要类
 * @create: 2021-04-23 08:36
 **/
public class StudentDao {

    static Connection conn;
    static ResultSet rs;
    static PreparedStatement pstmt;

    //查询所有学员
    public static List<Student> queryAllStu(String name,String phone){
        //获取数据库连接
        conn = DBUtlis.getConn();
        //书写sql
        StringBuffer sql = new StringBuffer("select * from student where 1=1");
        if (name != null || !"".equals(name)){
            sql.append(" and name like '%"+name+"%'");
        }
        if (phone != null || !"".equals(phone)){
            sql.append(" and phone like '%"+phone+"%'");
        }
        try {
            //创建sql管理器
            pstmt = conn.prepareStatement(sql.toString());
            //执行sql
            rs = pstmt.executeQuery();
            //处理结果集
            if (rs != null){
                List<Student> list = new ArrayList<Student>();
                while (rs.next()){
                    list.add(new Student(rs.getInt("id"),rs.getString("name"),
                                    rs.getString("sex"),rs.getString("level"),
                                    rs.getString("phone"),rs.getString("refereeName"),
                                    rs.getDate("startTime")));
                }
                return list;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtlis.closeConn(conn,rs,pstmt);
        }
        return null;
    }

    //查询单条学员
    public static Student queryOneById(int id){
        //获取数据库连接
        conn = DBUtlis.getConn();
        //书写sql
        String sql = "select * from student where id=?";
        try {
            //创建sql管理器
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setInt(1,id);
            //执行sql
            rs = pstmt.executeQuery();
            //处理结果集
            if (rs != null && rs.next()){
               return new Student(rs.getInt("id"),rs.getString("name"),
                        rs.getString("sex"),rs.getString("level"),
                        rs.getString("phone"),rs.getString("refereeName"),
                        rs.getDate("startTime"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtlis.closeConn(conn,rs,pstmt);
        }
        return null;
    }

    //新增学员方法
    public static int addStu(Student stu){
        //获取数据库连接
        conn = DBUtlis.getConn();
        //书写sql
        String sql = "insert into student values (0,?,?,?,?,?,?)";
        try {
            //创建sql管理器
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,stu.getName());
            pstmt.setString(2,stu.getSex());
            pstmt.setString(3,stu.getLevel());
            pstmt.setString(4,stu.getPhone());
            pstmt.setString(5,stu.getTjr());
            pstmt.setDate(6,new Date(stu.getStartTime().getTime()));
            //执行sql
            int result = pstmt.executeUpdate();
            //处理结果集
            if (result > 0){
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtlis.closeConn(conn,rs,pstmt);
        }
        return 0;
    }

    //删除学员方法(通过id)
    public static int deleteStu(int id){
        //获取数据库连接
        conn = DBUtlis.getConn();
        //书写sql
        String sql = "delete from student where id=?";
        try {
            //创建sql管理器
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setInt(1,id);
            //执行sql
            int result = pstmt.executeUpdate();
            //处理结果集
            if (result > 0){
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtlis.closeConn(conn,rs,pstmt);
        }
        return 0;
    }

    //修改学员方法
    public static int updateStu(Student stu){
        //获取数据库连接
        conn = DBUtlis.getConn();
        //书写sql
        String sql = "update student set name=?,sex=?,level=?,phone=?,refereeName=?,startTime=? where id=?";
        try {
            //创建sql管理器
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,stu.getName());
            pstmt.setString(2,stu.getSex());
            pstmt.setString(3,stu.getLevel());
            pstmt.setString(4,stu.getPhone());
            pstmt.setString(5,stu.getTjr());
            pstmt.setDate(6,new Date(stu.getStartTime().getTime()));
            pstmt.setInt(7,stu.getId());
            //执行sql
            int result = pstmt.executeUpdate();
            //处理结果集
            if (result > 0){
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtlis.closeConn(conn,rs,pstmt);
        }
        return 0;
    }
}
