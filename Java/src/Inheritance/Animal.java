package Inheritance;

//Example no 1:
//Animal class: name, age
//Dog class (inherits Animal): breed, behavior
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
