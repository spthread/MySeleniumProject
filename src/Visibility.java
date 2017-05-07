import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Visibility {

	
	WebDriver driver;
	@BeforeTest
	
	public void LaunchBrowser(){
		driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=BDmWV4fEOabv8wfstY3YDA&gws_rd=ssl");
		
	}
	
	
	@Test
	
	
	public void Testing()
	{
		String expectedTitle="Google";
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	
		
	}
	
@Test
	
	
	public void Testing2()
	{
	
	Boolean verifySearch=driver.findElement(By.id("gs_htif0")).isEnabled();
	
	System.out.println(verifySearch);
	
}

@Test


public void Testing3()
{

WebElement ele=driver.findElement(By.id("gs_htif0"));

ele.sendKeys("selenium");

Boolean verifySearch=driver.findElement(By.id("gs_htif0")).isEnabled();

System.out.println(verifySearch);




}

}
