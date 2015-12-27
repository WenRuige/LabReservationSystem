package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.Database;

public class PasswordController {
	public String dbpassword;
	public int flag = 0;
		public int password(String username,String password,String newpassword){
			
//			System.out.println(password);
//			System.out.println(username);
//			System.out.println(newpassword);
			Database db = new Database();
			ResultSet rs = db.executeQuery("select  password from lab_user where email="+"'"+username+"'");
			try {
				if(rs.next()){
					 dbpassword = rs.getString("password");
				}
				if(dbpassword.equals(password)){
					String sql ="update lab_user set password ="+"'"+newpassword+"'"+"where email="+"'"+username+"'";
					db.execute(sql);
					flag=  1;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return flag;
		}
}
