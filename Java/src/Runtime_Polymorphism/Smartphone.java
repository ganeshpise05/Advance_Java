package Runtime_Polymorphism;

public class Smartphone extends Products {

	public void productid(int id ) {
		System.out.println("Product id of smartphone is:"+id);
	}
	
	public void name (String name) {
		System.out.println("The name of product is: "+name);
	}
	
	public void brand (String brand) {
		System.out.println("Brand of smartphone is:"+brand);
	}
	
	public void price(int price) {
		System.out.println("The price of Iphone is:"+price);
	}
	
	public void warranty(int waranty) {
		System.out.println("The warranty for iphone is:"+waranty);
	}
	
	public void color(String color) {
		System.out.println("The color of iphone is: "+color);
		System.out.println("--------------------------------");

	}
}
