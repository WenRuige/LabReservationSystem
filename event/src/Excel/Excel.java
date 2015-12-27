package Excel;

import java.io.File;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Controller.ShowExcelController;
import javabean.Arrangement;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel {

	
	
	//导出excel
	public  static void export(){
		ShowExcelController show = new ShowExcelController();
	       ArrayList<Arrangement> data = show.excel();
	String []title ={"教师名称","实验室名称","理由","时间"};
	File file = new File("/Users/gewenrui/Desktop/data.xls");
	try {
		file.createNewFile();
		WritableWorkbook workbook = Workbook.createWorkbook(file);
		WritableSheet sheet = workbook.createSheet("sheet1",0);
		Label label = null;
		for(int i=0;i<title.length;i++){
			label = new Label(i,0,title[i]);
			sheet.addCell(label);
		}
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).getId());
			int id_temp =data.get(i).getId();
		
			label = new Label(0,i+1,data.get(i).getTeachername());
			sheet.addCell(label);
			label = new Label(1,i+1,data.get(i).getLabname());
			sheet.addCell(label);
			label = new Label(2,i+1,data.get(i).getReason());
			sheet.addCell(label);
			label = new Label(3,i+1,data.get(i).getTime());
			sheet.addCell(label);
		}
		workbook.write();
		workbook.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void main(String args[]) throws RowsExceededException, WriteException{
		ShowExcelController show = new ShowExcelController();
	       ArrayList<Arrangement> data = show.excel();
	String []title ={"教师名称","实验室名称","理由","时间"};
	File file = new File("/Users/gewenrui/Desktop/data.xls");
	try {
		file.createNewFile();
		WritableWorkbook workbook = Workbook.createWorkbook(file);
		WritableSheet sheet = workbook.createSheet("sheet1",0);
		Label label = null;
		for(int i=0;i<title.length;i++){
			label = new Label(i,0,title[i]);
			sheet.addCell(label);
		}
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).getId());
			int id_temp =data.get(i).getId();
		
			label = new Label(0,i+1,data.get(i).getTeachername());
			sheet.addCell(label);
			label = new Label(1,i+1,data.get(i).getLabname());
			sheet.addCell(label);
			label = new Label(2,i+1,data.get(i).getReason());
			sheet.addCell(label);
			label = new Label(3,i+1,data.get(i).getTime());
			sheet.addCell(label);
		}
		workbook.write();
		workbook.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
	}}
