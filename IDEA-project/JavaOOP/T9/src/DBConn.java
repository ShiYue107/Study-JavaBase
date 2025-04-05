import java.sql.*;

public class DBConn {
    //驱动类
    static final String DRIVER="com.mysql.jdbc.Driver";
    //数据库连接路径
    static final String URL="jdbc:mysql:///personalconsume";
    //数据库用户名
    static String name="root";
    //数据库密码
    static String pwd="107115";

    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //数据库连接
    public static Connection getConn(){
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(URL,name,pwd);
            System.out.println(123);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    //关闭数据库资源
    public static void connClose(ResultSet rs, PreparedStatement pstmt,Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (pstmt!=null){
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    //测试
    public static void main(String[] args) {
        DBConn dbc=new DBConn();
        dbc.getConn();

    }
}

