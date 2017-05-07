package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://timesofindia.indiatimes.com/");
		
		
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//*[@id='nav-city']/a"));
		
		act.moveToElement(ele).build().perform();
		WebElement ele1=driver.findElement(By.xpath("//*[@id='nav-city']/div/div/div/div[1]/ul/li[12]/a"));
		ele1.click();
		
		
		
		
	}

}
