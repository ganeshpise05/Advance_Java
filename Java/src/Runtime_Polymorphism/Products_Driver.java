package Runtime_Polymorphism;

public class Products_Driver {

	public static void main(String[] args) {
         
		Products pro = new Products();
		pro.productid(00);
		pro.name("Devices");
		pro.brand("brands");
		pro.price(000);
		pro.warranty(0);
		pro.color("null");
		
		Products t1 = new Television();
		t1.productid(5);
		t1.name("Television");
		t1.brand("Samsung");
		t1.price(150000);
		t1.warranty(5);
		t1.color( "black");
		
		Products s1 = new Smartphone();
		s1.productid(6);
		s1.name( "Smartphone");
		s1.brand("Iphone");
		s1.price(700000);
		s1.warranty(1);
		s1.color( "Light Green");
		
		Products l1 = new Laptop();
		l1.productid(7);
		l1.name( "Laptop");
		l1.brand( "Lenovo");
		l1.price(500000);
		l1.warranty(1);
		l1.color("Grey");
		
		
	}

}
