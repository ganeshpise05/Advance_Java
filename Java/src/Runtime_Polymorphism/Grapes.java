package Runtime_Polymorphism;

public class Grapes extends Fruit {

	public void name(String name) {
		System.out.println("the name of fruit is "+name);
	}
	
	public void origin(String origin) {
		System.out.println("The origin of Grapes is: "+origin);
	}
	
	public void taste(String taste) {
		System.out.println("The taste of grapes is: "+taste);
	}
	
	public void price(double price) {
		System.out.println("Price of grapes is:" + price);
		System.out.println("-----------------------");
	}
}
