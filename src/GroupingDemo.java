import org.testng.annotations.Test;


public class GroupingDemo {

	
	@Test(groups="G1")
	public void groupDemo1(){
		
		System.out.println("I am in demo1");
		
	}
	
	@Test(groups="G2")
	public void groupDemo2(){
		System.out.println("I am in demo2");	
		
	}
	@Test(groups="G1")
	public void groupDemo3(){
		System.out.println("I am in demo3");
		
	}
	@Test(groups="G2")
	public void groupDemo4(){
		
		System.out.println("I am in demo4");
	}
	
	
	
	
	
}
