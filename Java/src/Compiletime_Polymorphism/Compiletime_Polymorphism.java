package Compiletime_Polymorphism;

public class Compiletime_Polymorphism {

	public static void main(String[] args) {
		 
		System.out.println("Compiletime polymorphism:It is done at the compiletime of the object...");
		System.out.println("It has four types of compiletime polymorphism.");
		System.out.println("----->method overloading: If a class has more than one method of same name with different Formal Argument.. ");
		System.out.println("----->Constructor overloading: If a class has more than one constructor of same name with diff Formal Argument.. ");
		
		System.out.println("----->Method Shadowing: If we have Static methods of same name are declared in both superclass(parent) and subclass(child)...");
		System.out.println("                        It can gives the <<<<<<<<<preference to Parent class >>>>>>>>> not child class ");
		System.out.println("                        It dose not depend on type of object created it depends on type of reference used to invoke the method");
		
		System.out.println("----->Variable Shadowing:");

	}

}
