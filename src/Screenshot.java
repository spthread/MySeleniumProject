import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Screenshot {


		@Test
		
		public void Screeshot(){
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	
			
			try {
				FileUtils.copyFile(srcFile, new File("C:\\Users\\Admin\\Desktop\\New folder\\image.jpeg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}


