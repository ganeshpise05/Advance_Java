package Runtime_Polymorphism;

public class Animal_Driver {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.legs();
		ani.makeSound();
		ani.behave();
		
		Animal a1 = new Dog();//upcasting
		a1.makeSound();
		a1.legs();
		a1.behave();
		
		Animal a2 = new Lion();
		a2.makeSound();
		a2.legs();
		a2.behave();
		
		Animal a3 = new Lion();
		a3.makeSound();
		a3.legs();
		a3.behave();

	}

}
