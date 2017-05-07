package com.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void verifyBrowsers(String browserName){
		
		if(browserName.equalsIgnoreCase("firefox")){
			
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\apps\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		
		
		driver.get("https://mail.google.com/mail/u/0/#inbox/155a0e4379fe7f97");
		driver.quit();
		
	}
	
	
	
	
}
