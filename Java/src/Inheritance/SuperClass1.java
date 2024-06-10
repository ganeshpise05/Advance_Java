package Inheritance;

public class SuperClass1 {
	
	int prn ;
	String name;
	String add;
	
	SuperClass1()
	{
//		System.out.println("It is mandatory to written in this class bcz we have to written the below with argument constructor");
		System.out.println("From superclass 1");
	}
	SuperClass1(int prn,String name,String add)
	{
		this.prn=prn;
		this.name=name;
		this.add=add;
	}

	public void displaySuperClass1()
	{
		System.out.println(prn);
		System.out.println(name);
		System.out.println(add);
		System.out.println("----------------------------------");
	}
}
