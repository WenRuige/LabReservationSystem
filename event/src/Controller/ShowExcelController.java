package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.Database;
import javabean.Arrangement;

public class ShowExcelController {

	
	
	public ArrayList <Arrangement> excel(){
		Database db = new Database();
		ArrayList<Arrangement> list=new ArrayList<Arrangement>();
		String sql = "select * from lab_arrangement";
		 ResultSet rs = db.executeQuery(sql);
		
		 try {
			while(rs.next()){
				//System.out.println(rs.getString("name"));
				Arrangement arrangement  = new Arrangement();
				arrangement.setTeachername(rs.getString("name"));
				arrangement.setLabname(rs.getString("rname"));
				arrangement.setReason(rs.getString("reason"));
				arrangement.setTime(rs.getString("time"));
				arrangement.setId(rs.getInt("id"));
				arrangement.setStatus(rs.getInt("status"));
				list.add(arrangement);
			 }
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	
	//测试代码
		
		
	}
}
