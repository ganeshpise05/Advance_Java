package Inheritance;

public class Human {
	
	String name;
	String add;
	
	public Human() {}

	Human(String name,String add)
	{
		this.add=add;
		this.name=name;
	}
	
	public void displayHuman()
	{
		System.out.println(add);
		System.out.println(name);
        System.out.println("----------------------");
	}
}
