import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Selectelement {

	
	@Test
	
	public void select(){
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.indianrail.gov.in/dont_Know_Station_Code.html");
		
		List<WebElement> ele=driver.findElements(By.name("lccp_classopt"));
		
		Select sel=new Select(ele);
		
		List al=sel.getOptions();
		
		
		Iterator it=al.iterator();
		
		while(it.hasNext()){
			
			
		}
		
		sel.selectByIndex(0);
	}
}
