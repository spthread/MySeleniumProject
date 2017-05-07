package DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {

	WebDriver driver;
	@Test(dataProvider="uservalues")
	
	public void loginToPress(String username,String password) {
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id(("user_login"))).sendKeys(username);
		driver.findElement(By.id(("user_pass"))).sendKeys(password);
		
		driver.findElement(By.id("wp-submit")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if the assert is true then login successfull message will come and if unsuccessfull then login is invalid meesage will be printed.
		Assert.assertTrue(driver.getTitle().contains("Dashboard"), "The login is invaid");
	
		
		System.out.println("Login is successfull");
		
		
		
	}
	
	@AfterMethod
	public void pageClose(){
		driver.quit();
		}
	@DataProvider(name="uservalues")
	public Object[][] testData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo";
		
		
		data[1][0]="admin";
		data[1][1]="demo123";
		
		data[2][0]="admin1";
		data[2][1]="demo1";
		
		
		return data;
		
		
		
		
	}

}
