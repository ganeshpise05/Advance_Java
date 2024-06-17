package Runtime_Polymorphism;

public class Television extends Products {

	public void productid(int id) {
		System.out.println("Product id of Television is: "+id);
	}
	
	public void name(String name) {
		System.out.println("Name of product is: "+name);
	}
	
	public void brand(String brand) {
		System.out.println("Brand of television is:"+brand);
	}
	
	public void price(int price) {
		System.out.println("The price of given television is:"+price);
	}
	
	public void warranty(int waranty) {
		System.out.println("The warranty of given television  is: "+waranty+" year.");
	}
	
	public void color(String color) {
		System.out.println("The color of samsung television is: "+color);
		System.out.println("--------------------------------");
	}
}
