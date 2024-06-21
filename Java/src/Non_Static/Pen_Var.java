package Non_Static;

public class Pen_Var {
	
	String brand;
	String color;
	int price ;
	String grip;
	String material;
	int rating;
	
	Pen_Var(){
		System.out.println("From no args constructor of non-satic variables of pen.");
	}
	
	Pen_Var(String brand,String color,int price,String grip,String material,int rating){
		this.brand=brand;
		this.color=color;
		this.price=price;
		this.grip=grip;
		this.material=material;
		this.rating=rating;
	}
	
	public void displayPen() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(grip);
		System.out.println(material);
		System.out.println(rating);
	}

}
