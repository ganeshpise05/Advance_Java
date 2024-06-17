package Runtime_Polymorphism;

public class Fruit_Driver {

	public static void main(String[] args) {
		
		Fruit fr = new Fruit();
		fr.name("Fruit");
		fr.origin("Heaven");
		fr.taste("Not define");
		fr.price(0.0);
		
		Fruit f1 = new Mango();
		f1.name("Mango");
		f1.origin("Kokan");
		f1.taste("Sweet");
		f1.price(180);
		
		Fruit f2 = new Orange();
		f2.name("Orange");
		f2.origin("Nagpur");
		f2.taste("SweetJuicy");
		f2.price(250);
		
		Fruit f3 = new Grapes();
		f3.name("Grapes");
		f3.origin("Nashik");
		f3.taste("Source");
		f3.price(50);
	}

}
