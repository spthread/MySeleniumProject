package com.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

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
	
		//List<WebElement> data=driver.findElements(By.xpath(".//*[@id='calendarDiv']/div[7]/table/td"));
		List<WebElement> data=driver.findElements(By.tagName("td"));
		
		int total=data.size();
		
		for(int i=0;i<total;i++){
			
			String date=data.get(i).getText();
			System.out.println(date);
			 if(date.equalsIgnoreCase("14"))
			 {
				driver.findElement(By.linkText("14")).click();
			 }
		}
		
		
		
		
		
		
	}

}
