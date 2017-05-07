package com.WordPress.FactoryPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostPage {

	@FindBy(how=How.CLASS_NAME,using="wp-has-submenu")
	WebElement posts;
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu-posts']/div[3]/div/ul/li[2]/a")
	WebElement newPost;
	
	@FindBy(how=How.CLASS_NAME,using="current")
	WebElement addNewTitle;
	
	@FindBy(how=How.XPATH,using="//*[@id='tinymce']/p")
	WebElement writePost;
	
	
	@FindBy(how=How.ID,using="publish")
	WebElement publish;
	
	@FindBy(how=How.XPATH,using=".//*[@id='message']/p/a")
	WebElement viewPost;
	
	
	
	
	public void doPost(String title,String data)
	{
		
		posts.click();
		
		newPost.click();
		
		addNewTitle.sendKeys(title);
		
		writePost.sendKeys(data);
		
		publish.click();
		
		viewPost.click();
		
	}
	
	
	
	
	
	
}
