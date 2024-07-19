package Polymorphism;

public class Shape_Driver {

	public static void main(String[] args) {
		
		Shape s1 = new Circle();
		s1.shape();
		s1.area();
		
		System.out.println(" ");
		
		Shape s2 = new Square();
		s2.shape();
		s2.area();
		
		System.out.println(" ");
		
		Shape s3 = new Rectangle();
		s3.shape();
		s3.area();
	}
}
