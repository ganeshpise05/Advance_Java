package Interface;

public class Animal_Imp implements Animal {
	
	String name;
	int weight;
	int legs;
	
	public Animal_Imp() {}
	
	public Animal_Imp(String name,int weight,int legs)
	{
		super();
		this.name=name;
		this.weight=weight;
		this.legs=legs;
	}
	
	public void displayAnimal()
	{
		System.out.println(name);
		System.out.println(weight);
		System.out.println(legs);
	}
	
	public void eat()
	{
		System.out.println("It can eats the grass..");
	}
    
	public void sleep()
	{
		System.out.println("At a night it is also sleep like a dog");
	}
	
	public void move()
	{
		System.out.println("It can move one place to another palce");
	}
	
}
