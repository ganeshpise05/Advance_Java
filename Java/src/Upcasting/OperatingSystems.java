package Upcasting;

public class OperatingSystems extends Computer {
	
	String a = "Linux";
	
	public void test()
	{
		System.out.println("From class Operating System");
	}
	
	public void displayComputerOperatingSystem()
	{
		System.out.println(a);
		System.out.println(super.a);
		
		test();
		super.test();
		
		System.out.println(this);
		//System.out.println(super);  we can't print this super keyword.
	}

}
