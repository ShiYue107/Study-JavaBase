import java.sql.*;

public class JDBCConn {
	//数据库驱动
	static String Driver="com.mysql.jdbc.Driver";
	//数据库路径
	static String Url="JDBC:mysql://localhost:3306/javadb";
	//数据库用户名
	static String userName="root";
	//数据库密码
	static String pwd="107115";
	
	//加载驱动
	static {
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//连接数据库
	public Connection getConn() {
		Connection conn=null;
		try {
			conn = DriverManager.getConnection(Url, userName, pwd);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//关闭数据库
	public void close(ResultSet res, PreparedStatement pstsmt,Connection conn) {
		if (res!=null)
		if (pstsmt!=null)
		if (conn!=null)
			try {
				res.close();
				pstsmt.close();
				conn.close();
			} catch (SQLException throwables) {
				throwables.printStackTrace();
			}
	}
}
