package Inheritance;

public class Circle extends Shape {
	
	double radius;
	String border;
	
	public Circle(String color,double radius,String border)
	{
		super(color);
		this.radius=radius;
		this.border=border;
	}

	public void circle()
	{
		System.out.println(radius);
		System.out.println(border);
	}
}
