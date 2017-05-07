import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AllLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://www.google.co.in/");

List<WebElement> links=driver.findElements(By.tagName("a"));

System.out.println(links.size());

for(int i=0;i<links.size();i++)
{
	System.out.println(links.get(i).getText());
	
	if(links.get(i).getText().endsWith(""))
	{
		
		System.out.println("the link is present at:" +i);
	}
}



	}

}
