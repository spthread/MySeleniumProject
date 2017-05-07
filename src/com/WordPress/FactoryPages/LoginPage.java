package com.WordPress.FactoryPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	
WebDriver driver;


public LoginPage(WebDriver driver){    //need to create the parameterized construtor having driver as parameter
		
		this.driver=driver;                    // this keyword to distinguish between local variable and instance variable.
		
	}


	
	@FindBy(how=How.ID,using="user_login")
	WebElement username;
	
	
	@FindBy(how=How.XPATH,using="//*[@id='user_pass']")
	WebElement password;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password")
	WebElement forgot_Password;
	
	@FindBy(how=How.ID,using="wp-submit")
	WebElement submitButton;
	
	
	public void login(String uname,String pswd)
	{
		username.sendKeys(uname);
		password.sendKeys(pswd);
		submitButton.click();
	}
	
	
}
