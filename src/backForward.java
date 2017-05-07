import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class backForward {

@Test

public void bckfrwd() throws InterruptedException{
	
	WebDriver driver =new FirefoxDriver();
	driver.get("http://seleniumhq.org/");
	
	driver.findElement(By.linkText("Download")).click();
	
	Thread.sleep(3000);   
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	
}

}
