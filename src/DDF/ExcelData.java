package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	XSSFWorkbook ws;
	XSSFSheet sheet;
	

	public ExcelData(String Excelpath){
		
		try {
			File fs=new File(Excelpath);
			
			  FileInputStream is=new FileInputStream(fs);
			
			  ws = new XSSFWorkbook(is);
			  ws.getNumberOfSheets();
			  
			  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

	public String getData(int sheetnumber,int row,int column)
	{
		sheet = ws.getSheetAt(sheetnumber);
		
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
		
	}
	
	public int getRowCount(int sheetnumber){
		
		int rows =ws.getSheetAt(sheetnumber).getLastRowNum();
		
		rows=rows+1;
		
		return rows;
		
		
	}
	
}
