package POM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MediaPage {

	public void getDate(){
	 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	 
	 // Print the Date
	 System.out.println(date1);}
}
