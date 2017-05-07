package com.scroll;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollPage {

	@Test
	

	public void scrollPage(){
		
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://jqueryui.com/");
		
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		As
		
		}
		
		
		
		
			
		
		
		
	}
	
	
	
	
	
	
	

}
