package Polymorphism;

public class Father_SonDriver {
	
	public static void main(String[] args) {
		
		Father f = new Son();//upcasting
		f.finance();
		f.status();
	}

}
