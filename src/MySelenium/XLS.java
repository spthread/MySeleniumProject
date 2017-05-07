
public class XLS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XLS=new XLS("C:\\Users\\mohit\\Desktop\\Book1.xlsx");
		
	/*boolean b=	xl_Reader.isSheetExist("Selenium");
	
	boolean b1=	xl_Reader.isSheetExist("QTP");
	
	System.out.println("IS sheet with name selenium exists :" + b);
	
	System.out.println("IS sheet with name Qtp exists :" + b1);*/
		
		int i=xl_Reader.getRowCount("Selenium");
		
	//	System.out.println("Row count is : " + i);
		
		//System.out.println("Column count :" + xl_Reader.getColumnCount("Selenium"));
		//System.out.println("DAta at location:" + xl_Reader.getCellData("Selenium", 2, 2));
		
	//	System.out.println("DAta at location:" + xl_Reader.getCellData("Selenium", "Usename", 3));
		
		System.out.println("DAta at location:" + xl_Reader.setCellData("Selenium", "Usename", 7, "xyajjdks"));
		/*boolean b=xl_Reader.isSheetExist("Selenium");
		
		System.out.println("Sheet Exixt:" + b);
		
		
		
		System.out.println("Sheet two:" + xl_Reader.isSheetExist("abc"));
		
		
		System.out.println("Number of rows:" + xl_Reader.getRowCount("Selenium"));
		
		
		System.out.println("Number of columns"+ xl_Reader.getColumnCount("Selenium"));
		
		System.out.println("Cell data" + xl_Reader.getCellData("Selenium", 4, 1));
		
		xl_Reader.setCellData("Selenium", "passsword", 5, "3RI");
		
		//System.out.println("Firest sheet:"+ xl_Reader.isSheetExist("Sheet1"));
		
	//	System.out.println("Eight Sheet"+ xl_Reader.isSheetExist("Sheet8"));
		
		//System.out.println(xl_Reader.getRowCount("Sheet1"));
		
		//System.out.println(xl_Reader.getColumnCount("Selenium"));
		
		//System.out.println(xl_Reader.get);
		
	//	System.out.println(xl_Reader.getCellData("Selenium", "Usename", 5));
		
		//xl_Reader.setCellData("Selenium", "Usename", 8, "3riInfotech");
		
		//xl_Reader.addSheet("testNG");
		
	//	xl_Reader.addColumn("Selenium", "firstTest");
		
		Xls_Reader d=new Xls_Reader("C:\\Users\\mohit\\Desktop\\Book1.xlsx");
		
		int rowCount=d.getRowCount("Sheet1");
		
		System.out.println("Number of rows present n sheet1 is "+rowCount);
		
		
		System.out.println("Number of cloumns in sheet is "+d.getColumnCount("Sheet1"));
		
		
		System.out.println("Data at location 3rd row and 2nd column is "+ d.getCellData("Sheet1", 1, 2));
		
		System.out.println("Data to be enter at location 4th cloum and 4 th row is "+ d.setCellData("Sheet1", "passsword", 4, "abc"));

		Xls_Reader d = new Xls_Reader("C:\\Users\\mohit\\Desktop\\Book1.xlsx");
		
		int i=d.getRowCount("sheet1");
		
		System.out.println(d.getColumnCount("sheet1"));
			
		System.out.println("total rows:" +i);
		
		String str=d.getCellData("sheet1", 1, 2);
		
		System.out.println("cell value" +str);
		
		
		d.setCellData("Sheet1", "Usename", 5, "welcome");
		
		Xls_Reader reader=new Xls_Reader("C:\\Users\\mohit\\Desktop\\Book1.xlsx");
		
		int rowCount1= reader.getRowCount("sheet1");
		System.out.println("row count is------"+ rowCount1);
		
		System.out.println(reader.getColumnCount("sheet1"));
		
String str=reader.getCellData("sheet1", "Usename", 3);
		
		System.out.println("cell value" +str);
		
		
		
		
		
	
		
		reader.setCellData("Sheet1", "Usename", 5, "welcome");
	
	//	System.out.println(d.getRowCount("Data"));
	//	System.out.println(d.getCellData("Data", "Place", 3));
		
	//	d.setCellData("Data", "Name", 10, "hello");
		
		
		//Xls_Reader d1 = new Xls_Reader("PATH");
*/
	}

}
