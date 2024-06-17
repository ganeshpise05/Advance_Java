package Runtime_Polymorphism;

public class Orange extends Fruit {

	public void name(String name) {
		System.out.println("Name of fruit is: "+name);
	}
	
	public void origin(String origin) {
		System.out.println("Origin of orange is: "+origin);
	}
	
	public void taste(String taste) {
		System.out.println("Taste of orange is: "+taste);
	}
	
	public void price(double price) {
		System.out.println("The price of oranges is: "+price);
		System.out.println("-----------------------");
	}
}
