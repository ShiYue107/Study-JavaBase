package com.student.utlis;

import java.sql.*;

/**
 * @author: IT_Koma
 * @name:Student_Sys
 * @description: 数据库连接的工具类
 * @create: 2021-04-23 00:44
 **/
public class DBUtlis {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb?characterEncoding=UTF-8";
    private static final String NAME = "root";
    private static final String PWD = "107610";

    static{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL,NAME,PWD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(Connection conn, ResultSet rs, PreparedStatement pstmt){

        try {
            if (conn != null)
                conn.close();
            if (rs != null)
                rs.close();
            if (pstmt != null)
                pstmt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBUtlis.getConn();
    }
}
