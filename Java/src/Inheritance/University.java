package Inheritance;

public class University {
	
	String vc;
	int regno;
	String name;
	String loc;
	
	University()
	{
		System.out.println("From no argument constructor of Univerrsity");
	}
	
	University(String vc,int regno,String name,String loc)
	{
		this.vc=vc;
		this.regno=regno;
		this.name=name;
		this.loc=loc;
	}
	
	public void displayUniversity()
	{
		System.out.println(vc);
		System.out.println(regno);
		System.out.println(name);
		System.out.println(loc);
		System.out.println("------------------------------");
	}
	

}
