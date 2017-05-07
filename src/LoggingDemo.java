import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoggingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		BasicConfigurator.configure();
        Logger log = Logger.getLogger("devpinoyLogger");
        
        driver.get("http://healthunify.com/bmicalculator/");                  				 
        //log.debug("opening webiste");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        
		// log.debug("entring weight");
		 driver.findElement(By.name("wg")).sendKeys("87");
        //log.debug("selecting kilograms");
        driver.findElement(By.name("opt1")).sendKeys("kilograms");
        //log.debug("selecting height in feet");
        driver.findElement(By.name("opt2")).sendKeys("5");
        
        driver.findElement(By.name("opt3")).sendKeys("10");
        
        driver.findElement(By.name("cc")).click();

		         String SIUnit = driver.findElement(By.name("si")).getAttribute("value");
       
        String USUnit = driver.findElement(By.name("us")).getAttribute("value");
       
        String UKUnit = driver.findElement(By.name("uk")).getAttribute("value");
       
        String note = driver.findElement(By.name("desc")).getAttribute("value");
     
        System.out.println("SIUnit = " + SIUnit);
        System.out.println("USUnit = " + USUnit);
        System.out.println("UKUnit = " + UKUnit);
        System.out.println("note = " + note); 
		driver.quit();
	}
		
	}


