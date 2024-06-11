package Inheritance;

public class ShapeCircleDriver {

	public static void main(String[] args) {
		 
		Circle c1 = new Circle("Red",4.5,"Solid");
		c1.color();
		c1.circle();
		
		Shape s1 = c1;//Upcasting
		s1.color();
		//s1.circle(); /CTE
		

	}

}
