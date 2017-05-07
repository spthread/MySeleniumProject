package DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLoginExcel {

	WebDriver driver;
	@Test(dataProvider="uservalues")
	
	public void loginToPress(String username,String password) throws InterruptedException{
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id(("user_login"))).sendKeys(username);
		driver.findElement(By.id(("user_pass"))).sendKeys(password);
		
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
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
		
		ExcelData exe =new ExcelData("D:\\Java Learning WorkSpace\\JBDCWorkSpace\\NewPractice\\src\\ExcelReader.xlsx");
	
	int rows=exe.getRowCount(0);
		Object[][] data= new Object[rows][2];
	
	
	for(int i=0;i<rows;i++){
		
		
		data[i][0]=exe.getData(0, i, 0);
		data[i][1]=exe.getData(0, i, 1);
		}
	return data;

}


}
