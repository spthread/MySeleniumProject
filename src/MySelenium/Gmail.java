package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement ele=driver.findElement(By.xpath("//a[@id='gmail-sign-in']"));
		ele.click();
		WebElement elee=driver.findElement(By.xpath("//input[@id='Email']"));
		elee.sendKeys("patel.nive858@gmail.com");
		
		WebElement eleee=driver.findElement(By.xpath("//input[@id='next']"));
		eleee.click();

		WebElement ele1=driver.findElement(By.xpath("//input[@id='Passwd']"));
		ele1.sendKeys("Nivi@tata12");
		
		WebElement ele2=driver.findElement(By.xpath("//input[@id='signIn']"));
		ele2.click();
		
		
		

	}

}
