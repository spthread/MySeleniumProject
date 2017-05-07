package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderop {

	
	static FileReader fr=null;
	static BufferedReader br=null;
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

 fr=new FileReader("D:/src/Alerts.txt");
br=new BufferedReader(fr);

String line;
try {
	line = br.readLine();
	
	
	while(line!=null){
		System.out.print(line);
		
		line=br.readLine();
	}
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}






		
	}

}
