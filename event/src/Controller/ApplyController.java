package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import DB.Database;

public class ApplyController {
			public String username;
			public int flag = 0;
		public  int  apply(String email,String labname,String content,String time){
			System.out.println(labname);
//			System.out.println(content);
//			System.out.println(time);
//			System.out.println(email);
			Database db = new Database();
			String sql = "select name from lab_user where email ="+"'"+email+"'";
			ResultSet rs =db.executeQuery(sql);
			try {
				if(rs.next()){
					username = rs.getString("name");
					username.trim();
				}
				labname.trim();
				System.out.println(username);
				
				String sql1 = "insert into lab_arrangement(name,rname,reason,time) values("+"'"+username+"'"+","+"'"+labname+"'"+","+"'"+content+"'"+","+"'"+time+"'"+")";
				System.out.println(sql1);
				 flag = db.execute(sql1);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flag;
		}
}
