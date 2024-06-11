package Inheritance;

public class FruitApple_Driver {

	public static void main(String[] args) {
		
		Apple a1 = new Apple("Red","Sweet","kashmiri","Shrinagar");
		a1.displayApple();
		
		Fruit f1 = a1 ;
		f1.display();
	}

}
