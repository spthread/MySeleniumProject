import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WindowHandle {

	
	@Test
	public void WindowHandles() throws InterruptedException{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String beforeTitle=driver.getTitle();
		System.out.println("TitleBeforeWindowHandles" +beforeTitle);
		
		String parentWindow=driver.getWindowHandle();
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a"));
		ele.click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> itr=windows.iterator();
		
		while(itr.hasNext()){
			
			String childWindow=itr.next();
			
			if(!parentWindow.equalsIgnoreCase(childWindow)){
				
				driver.switchTo().window(childWindow);
				
				Thread.sleep(5000);
				
			}
		}
		
		String afterTitle=driver.getTitle();
		System.out.println("AfterTitle is" +afterTitle);
		
		driver.close();
		
		
		driver.switchTo().window(parentWindow);
		
		driver.close();
		
	}
	

	
	
	
}
