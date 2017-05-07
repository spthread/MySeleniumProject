import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations {

	
	
	@BeforeTest
	public void BeforeTest(){
		System.out.println("Before Test");
		
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest(){
		System.out.println("Afetr Test");
		
	}
	
	@org.testng.annotations.BeforeMethod
	
	public void BeforeMethod(){
		System.out.println("Before Method");
		
	}
	
	@org.testng.annotations.AfterMethod
	
	public void AfterMethod(){
		System.out.println("Afetr Method");
		
	}
	
	@org.testng.annotations.BeforeClass
	
	public void BeforeClass(){
		System.out.println("Before Class");
		
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass(){
		System.out.println("Afetr Class");
		
	}
	
	@Test(priority=1)
	
	public void Test1()
	{
		System.out.println("I am in test1");
	}
	
	
	
	
	
	@Test(priority=0)
	public void Test2(){
		
		System.out.println("I am in test2");
	}
	
	
	
}
