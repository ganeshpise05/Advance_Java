package Non_Static;

public class Ac_Methods {
	
	String brand;
	int price;
	String color;
	int warranty;
	String modes;
	int weight;
	String control;
	
	Ac_Methods(){
		System.out.println("From no args constructor of Ac.");
	}
	
	Ac_Methods(String brand,int price,String color,int warranty,String modes,int weigth,String control){
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.warranty=warranty;
		this.modes=modes;
		 this.weight=weight;
		this.control=control;
	}
	
	public void displayAc() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(warranty);
		System.out.println(modes);
		System.out.println(weight);
		System.out.println(control);
	}
	
	public void brand() {
		System.out.println(brand);
	}
	
	public void price() {
		System.out.println(price);
	}
	
	public void color() {
		System.out.println(color);
	}

}
