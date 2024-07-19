package Polymorphism;

public class Animal_Driver {

	public static void main(String[] args) {
		
		Animal a1 = new Lion();//Upcasting
		a1.sound();
		a1.legs();
		
		System.out.println(" ");
		
		Animal a2 = new Dog();
		a2.sound();
		a2.legs();
		
		System.out.println(" ");
		
		Animal a3 = new Cat();
		a3.sound();
		a3.legs();
	}
}
