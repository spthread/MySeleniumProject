import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Check {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
WebDriver driver=new FirefoxDriver();
		
		driver.get("http://gmail.com");
		
		driver.findElement(By.id("Email")).sendKeys("patel.nive858@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("next")).click();
		
		
	}

}
