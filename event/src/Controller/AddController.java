package Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import DB.Database;

public class AddController {
		
		
		public int add(String title,String content){
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
			String time = dateFormat.format( now ); 
			
			Database db = new Database();
			String sql = "insert into lab_notice(title,content,time)values("+"'"+title+"'"+","+"'"+content+"'"+","+"'"+time+"'"+")";
			System.out.println(sql);
			int data = db.execute(sql);
			
			return data;
			
		}
	}
