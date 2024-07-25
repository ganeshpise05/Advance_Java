package Abstraction;

public class CalculatorImplimentation extends Calculator {

	 
	public void addition(int a, int b) {
		 
		System.out.println(a+b);
	}

	public void substraction(int x, int y) {
		 
		System.out.println(x-y);
	}

	 
	public void multiplication(int p, int q) {
		 
		System.out.println(p*q);
	}
	
	public void greeting()
	{
		System.out.println("This is a bad calculator"); //This is not accept because this type of method is not present in parent class.
	}

	 
	public void division(double j, double k) {
		 
		System.out.println(j/k);
	}
	
	

}
