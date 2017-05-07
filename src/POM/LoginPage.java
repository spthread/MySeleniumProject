package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

//This class will load all the locators and methods of login page.

public class LoginPage {


		WebDriver driver;          //instance variable
		
		By username=By.id("user_login"); //By is a class in selenium
		By password=By.xpath("//*[@id='user_pass']");
		By login=By.id("wp-submit");
	
		
		                                        //local variable
	
	public LoginPage(WebDriver driver){    //need to create the parameterized construtor having driver as parameter
		
		this.driver=driver;                    // this keyword to distinguish between local variable and instance variable.
		
	}

	
	public void typeUserName(String uname)
	{
		driver.findElement(username).sendKeys(uname);
		
	}
	
	public void typePassword(String paswd)
	{
		driver.findElement(password).sendKeys(paswd);
		
	}
	
	public void typeUnameandPsswd(String name,String ppd)
	{
		
		driver.findElement(username).sendKeys(name);
		driver.findElement(password).sendKeys(ppd);
		
	}
	
	public void checkLoginPage(){
		
		String expectedTitle="Dashboard ‹ WordPress Demo Install — WordPress";
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertTrue(actualTitle.contains(expectedTitle), "Login is unsuccesfull");
		
		System.out.println("Login is successfull");	
	}
	
	public void clickButton()
	{
		driver.findElement(login).click();
		
	}
	
public void linksDisplay(){
		try{
		List<WebElement> wb=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<=wb.size();i++){
			
			if(wb.get(i).getText().equals("WordPress")){
				wb.get(i).click();
			}
		}
		}
		
		catch(org.openqa.selenium.StaleElementReferenceException ex){
			System.out.println("removed error");
			}
}
	
}
