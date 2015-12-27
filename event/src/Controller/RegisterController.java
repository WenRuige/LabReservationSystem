package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import DB.Database;

public class RegisterController {

	public int role;	
	//role 的值  如果为1 表示存在 为0表示不存在
		public int register(String name,String pwd){
			Date date=new Date();
			DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
			String time=format.format(date);
			Database db = new Database();
			ResultSet rs = db.executeQuery("select * from lab_user where email="+"'"+name+"'");
			try {
				if(rs.next()) 
					{role =1;}
				else{
					//2为教师
					String sql = "insert into lab_user(name,email,password,time,role) values("+"'"+name+"'"+","+"'"+name+"'"+","+"'"+pwd+"'"+","+time+",2)";
					System.out.println(sql);
					db.execute(sql);
					role = 0;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return role;
			
		}
}
