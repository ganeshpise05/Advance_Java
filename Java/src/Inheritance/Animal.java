package Inheritance;

public class Animal {
	
	String name;
	double age;
	
	Animal()
	{
		
	}
	
	public Animal(String name,double age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void name()
	{
		System.out.println("Name of dog is: " +name ); 
	}
	
	public void age()
	{ 
		System.out.println(" Age is " + age);
	}

}
