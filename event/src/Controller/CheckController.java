package Controller;

import DB.Database;

public class CheckController {

	
	
	
public int agree(String id){
	String sql = "update lab_arrangement set isagree = 1 where id="+id;
	String sql1 = "update lab_arrangement set status = 1 where id="+id;	
	Database db = new Database();
	  int result = db.execute(sql);
	  int result1 = db.execute(sql1);
	
	  
	return result;
	
}
public int refuse(String id ){
	String sql = "update lab_arrangement set isagree = 2 and status = 2 where id="+id;
	String sql1 = "update lab_arrangement set  status = 2 where id="+id;
	Database db = new Database();
	 int result = db.execute(sql);
	 int result1 = db.execute(sql1);
	return result;
	
}
}
