package DB;

import java.sql.*;

import com.mysql.jdbc.PreparedStatement;

public class Database {
	public static final String url = "jdbc:mysql://localhost:3306/lab?useUnicode=true&characterEncoding=GBK";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "";
	public static Connection conn = null;
	public static Statement stmt;
	

	// 链接数据库
	public Database() {
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
		

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 执行查询sql
	public	ResultSet executeQuery(String sql) {
		ResultSet rs =null;
			 
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		     return rs;
	}
	
	public	int execute(String sql) {
		int rs =0;
			 
			try {
				stmt = conn.createStatement();
				rs = stmt.executeUpdate(sql);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		     return rs;
	}
	
	
}
