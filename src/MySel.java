import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MySel {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		 // TODO Auto-generated method stub
  WebDriver driver=new FirefoxDriver();
  driver.get("https://www.facebook.com/");
  Thread.sleep(3000);
  driver.findElement(By.id("email")).sendKeys("surendrapatel84@gmail.com");
  driver.findElement(By.id("pass")).sendKeys("uikgtjyufvtgf");
  driver.findElement(By.id("u_0_q")).click();
		
	}

}
