
public class Parent {

	void give(){
		
		System.out.println("ahsgh");
	}
	
	void show(){
		
		System.out.println("a");
		System.out.println("b");
	}
	
	


public static class child extends Parent{
	
	void show(){
		
		System.out.println("c");
		System.out.println("d");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent();
		child c=new child();
		Parent p1=new child();
		
		




p.show();
c.show();
p1.show();
		
	}

}
}