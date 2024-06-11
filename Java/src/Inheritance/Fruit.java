package Inheritance;

public class Fruit {
	
	String color;
	String taste;
	
	public Fruit() {}
	
	Fruit(String color,String taste)
	{
		this.color=color;
		this.taste=taste;
	}
	
	public void display()
	{
		System.out.println(color);
		System.out.println(taste);
		System.out.println("-------------------");
	}

}
