import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class mouseoverevents {

	
	WebDriver driver;
	
	@org.testng.annotations.Test
	
	public void Test(){
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement ele=driver.findElement(By.id("email"));
		
		String bg =ele.getCssValue("Background-color");
		Actions act= new Actions(driver);
	
Action multipleAction= act.moveToElement(ele).click()
.keyDown(ele, Keys.SHIFT).sendKeys(ele, "patel.nive858@gmail.com").
keyUp(ele, Keys.SHIFT).doubleClick(ele).contextClick(ele).build();
		
		
		multipleAction.perform();
		
		
		
		
	
	}
}
