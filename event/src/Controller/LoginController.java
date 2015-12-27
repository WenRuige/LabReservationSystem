package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.Database;

public class LoginController {
	/**
	 * Author: gewenrui Method:比对web传的数值是否与数据库读取的数值相同 return:boolean
	 * 
	 * @throws SQLException
	 * 
	 */
	public String password;
	public int role;
	public int flag;
	public int login(String name,String pwd){
			
			//此处需要从数据库读取标志位
			//如果标志位为1则跳转到admin ,否则跳转为teacher用户
			//role 0   -----用户名不存在
			//role 1   -----密码输入不正确
			//role 2   -----教师端
			//role 3   ---- 管理员
			
			Database db = new Database();
			ResultSet  rs =db.executeQuery("select * from lab_user where email="+"'"+name+"'");
			  			try {
			  				if(rs.next()){
							//获取密码
							password = rs.getString("password");
							//获取权限位
						    role = rs.getInt("role");
			  				}else{
			  					//用户名不存在
			  						flag = 0;
			  				}
			  				if(pwd.equals(password)){
			  					//返回结果的role值
			  					flag = role;
			  					
			  				}else{
			  					//密码不正确
			  					flag = 1;
			  				}
			  				
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return flag;
			
		
		}

}
