package Inheritance;

public class SuperClass12Driver {
	
	public static void main(String[] args) {
		
//		SuperClass1 c1 = new SuperClass1();
//		c1.displaySuperClass1();
//		
//		SuperClass2 c2 = new SuperClass2();
//		c2.displaySuperClass2();
	 
		SuperClass1 c3 = new SuperClass2();
		c3.displaySuperClass1();
		
		
		SuperClass1 c4 = new SuperClass2(1234,"Ganesh","Malshiras",12,"B+");
		c4.displaySuperClass1();
		//c4.displaySuperClass2();//father  can't  use the properties of son
	}

}
