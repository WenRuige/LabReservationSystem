package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.Database;
import javabean.Notice;


public class ShowNoticeController {
	public ArrayList<Notice> show(){
		Database db = new Database();
		ArrayList<Notice> list=new ArrayList<Notice>();
		String sql = "select * from lab_notice order by id desc limit 3";
		 ResultSet rs = db.executeQuery(sql);
		
		 try {
			while(rs.next()){
				Notice notice = new Notice();
				
				 notice.setId(rs.getInt("id"));
				 notice.setTitle(rs.getString("title"));
				 notice.setContent(rs.getString("content"));
				 notice.setTime(rs.getString("time"));
				
				 list.add(notice);
			 }
			
//			for(int i =0;i<list.size();i++){
//				System.out.println(list.get(i).getName());
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
