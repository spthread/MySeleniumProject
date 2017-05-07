package com.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tabledata {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.indianrail.gov.in/dont_Know_Station_Code.html");
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='formId']/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[4]/img"));
		element.click();
		
		Thread.sleep(5000);
		
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='calendarDiv']/div[7]/table/tbody/tr[3]/td[2]"));
		ele.click();
		
		
		
		
		
		
		
		
		
		
	}

}
