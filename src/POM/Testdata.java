package POM;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testdata {

	WebDriver driver;
	


	
	
	@BeforeTest
	public void beforetest(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\apps\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");}
	
	
	@Test
	public void Test1(){
		LoginPage lp = new LoginPage(driver);
		lp.typeUserName("admin");
		lp.typePassword("demo123");
		lp.clickButton();
		lp.checkLoginPage();
		;
	}
	
	@Test
	
	public void Test2(){
		LoginPage lp = new LoginPage(driver);
		//lp.linksDisplay();
		
	}
	
@Test
	
	public void Test3(){
	
PostPage pg=new PostPage(driver);
pg.selectItems();
}

@Test

public void Test4() throws InterruptedException{

PostPage pg=new PostPage(driver);	
pg.postTitle("Nivedita's Blog");
pg.windowSwitch();
pg.seePosts("90");
}

@Test

public void Test5(){
	
	MediaPage pg=new MediaPage();
	pg.getDate();
}




	
	
	/*@AfterTest()
	public void exitTest(){
		
		driver.quit();
	}*/
	
	
}
