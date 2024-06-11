package Inheritance;

public class Dog extends Animal {
	
	String breed;
	String behaviour;
	
	 Dog()
	{
		
	}
	
	 public Dog(String name,double age,String breed,String behaviour)
	{
		super(name,age);
		this.breed=breed;
		this.behaviour=behaviour;
	}
	
	public void breed()
	{
		System.out.println("The given dog breed is :"+breed); 
	}
	
	public void behaviour()
	{ 
		System.out.println("The behaviour of dog is :"+behaviour);
	}
	

}
