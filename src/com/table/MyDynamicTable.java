package com.table;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyDynamicTable {

	
	@Test
	
	public void table() throws InterruptedException{
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.indianrail.gov.in/dont_Know_Station_Code.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[4]/img"));
		ele.click();
		
		Thread.sleep(5000);
		
		List dates=(List) ele.findElements(By.tagName("tr"));
		
		System.out.println(dates.size());
		
		
		
	}
}
