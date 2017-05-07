import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class n1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/n1.html");
		
		WebElement ele=driver.findElement(By.xpath(".//*[@id='myText']"));
		System.out.println(ele.getText());
		
		Actions mouse2 = new Actions(driver);
		mouse2.
		
		mouse2.clickAndHold(ele).sendKeys(Keys.chord(Keys.CONTROL, "a"), "55").build().perform();
		//ele.sendKeys(Keys.chord(Keys.CONTROL, "a"), "55");
		
	}

}
