package Inheritance;

public class Apple extends Fruit {
	
	String verity;
	String origin;
	
	public Apple() {}
	
	Apple(String color,String taste,String verity,String origin)
	{
		super(color,taste);
		this.verity=verity;
		this.origin=origin;
	}
	
	public void displayApple()
	{
		display();
		System.out.println(verity);
		System.out.println(origin);
	}

}
