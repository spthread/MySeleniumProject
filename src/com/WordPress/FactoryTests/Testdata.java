package com.WordPress.FactoryTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.WordPress.FactoryPages.BroserFactory;
import com.WordPress.FactoryPages.LoginPage;
import com.WordPress.FactoryPages.PostPage;

public class Testdata {

	
	
	

	@org.testng.annotations.Test
	public void Test(){
	
		WebDriver driver=BroserFactory.StartBrowser("Firefox","http://demosite.center/wordpress/wp-login.php");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		PostPage pp=PageFactory.initElements(driver, PostPage.class);
		
		lp.login("admin", "demo123");
		
		pp.doPost("My Blog", "My Deatils ar here");
		
		}
	
	
}
