package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.Database;
import javabean.Arrangement;
import javabean.Room;

public class ShowArrangementController {
	public ArrayList <Arrangement> arrangement(){
		Database db = new Database();
		ArrayList<Arrangement> list=new ArrayList<Arrangement>();
		String sql = "select * from lab_arrangement where isagree = 0";
		 ResultSet rs = db.executeQuery(sql);
		
		 try {
			while(rs.next()){
				Arrangement arrangement  = new Arrangement();
				arrangement.setTeachername(rs.getString("name"));
				arrangement.setLabname(rs.getString("rname"));
				arrangement.setReason(rs.getString("reason"));
				arrangement.setTime(rs.getString("time"));
				arrangement.setId(rs.getInt("id"));
				list.add(arrangement);
			 }
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	
	//测试代码
		
		
	}
	public static void main(String args[]){
		ShowArrangementController s = new ShowArrangementController();
		ArrayList<Arrangement> data = s.arrangement();
		for(int i = 0;i<data.size();i++){
			System.out.println(data.get(i).getTeachername());
			
		}
	}
}
