package com.WordPress.FactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BroserFactory {
	
	static WebDriver driver;

	public static WebDriver StartBrowser(String BrowserName,String url){
		
		
		if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);
		
		
		return driver;
	}
}