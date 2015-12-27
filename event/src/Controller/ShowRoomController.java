package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.Database;
import javabean.Room;

public class ShowRoomController {

	//使用arraylist实现数据的存储
	public ArrayList<Room> show(){
		Database db = new Database();
		ArrayList<Room> list=new ArrayList<Room>();
		String sql = "select * from lab_room";
		 ResultSet rs = db.executeQuery(sql);
		
		 try {
			while(rs.next()){
				 Room room = new Room();
				
				 room.setName(rs.getString("name"));
				
				 list.add(room);
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
	//测试代码
	
	
	public static void main(String args[]){
		
		ShowRoomController s = new ShowRoomController();
		         ArrayList<Room> data = s.show();
		         for(int i =0;i<data.size();i++){
						System.out.println(data.get(i).getName());
					}
		         
	}
}
