package POM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostPage {
	
	WebDriver driver;
	
	By post=By.xpath(".//*[@id='menu-posts']/a");
	By addnew=By.linkText("Add New");
	By postpagetitle=By.name("post_title");
	By upload=By.id("content-add_media");
	By content=By.name("content");
	By preview=By.id("post-preview");
	By publish=By.id("publish");
	By seeallPost=By.xpath(".//*[@id='menu-posts']/div[3]/div/ul/li[1]/a");

	By published=By.xpath(".//*[@id='wpbody-content']/div[4]/ul/li[2]/a");
	
	
	
	
	
	public PostPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void selectItems(){
		
		driver.findElement(post).click();
		driver.findElement(addnew).click();
		//List<WebElement>allOptions=driver.findElements(By.xpath(".//*[@id='menu-posts']/div[3]/div/ul/li"));
		
		//for(int i=0;i<=allOptions.size();i++){
			
			//System.out.println(allOptions.get(i).getText());
			/*if(allOptions.get(i).getText().equals("Add New")){
				
				  allOptions.get(i).click();    
				 }*/
		}
	
	public void postTitle(String title) throws InterruptedException{
		
		driver.findElement(postpagetitle).sendKeys(title);
		//driver.findElement(upload).click();
		
		Thread.sleep(5000);
		
		driver.findElement(content).sendKeys("My name is Nivedita Patel.I live in Bangalore.My company name is TCS.");
		
		//String parentWindow=driver.getWindowHandle();
		
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		/*List<WebElement> radios=driver.findElements(By.name(".//*[@name='media_type']"));
		
		for(int i=0;i<radios.size();i++){
			
			String radioValue=radios.get(i).getText();
			if(radioValue.equalsIgnoreCase("Audio, Video, or Other File")){
				radios.get(i).click();
			}*/
		}
		
	
	public void windowSwitch() throws InterruptedException{
		
		
		String winHandleBefore = driver.getWindowHandle();

		driver.findElement(preview).click();
		
		Thread.sleep(8000);

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		
		driver.findElement(publish).click();

	}
	
	
	public void seePosts(String values){
		
		driver.findElement(seeallPost).click();
		driver.findElement(published).click();
		
		List<WebElement> datas=driver.findElements(By.name(".//*[@name='post[]']"));
		
		for(int i=0;i<=datas.size();i++){
			String dd=datas.get(i).getAttribute("value");
			if(dd.equals(values)){
				datas.get(i).click();	
				
			}
		}
	}
	}
	
	
	

