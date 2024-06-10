package Abstraction;

public class CalculatorDriver {

	public static void main(String[] args) {
		 
		Calculator c = new CalculatorImplimentation();
		c.addition(1, 3);
		c.substraction(10, 5);
		c.multiplication(2, 4);
		c.division(10, 2);
		//c.greeting();  When we write the inwanted method in child class that can't be accepted.The only solution is parent class methods should be present in child class
		                //other than parent class methods can't be accepted here 

	}

}
