package Interface;

public class Calculator_Impli implements Calculator  
  {

     String name;
	 String brand;
	int model;
	int price;
	
	public Calculator_Impli() {}
	
	public Calculator_Impli(String name,String brand,int model,int price)
	{
		super();
		this.name=name;
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public void displayImpli()
	{
		System.out.println(name);
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	public void div(double a,double b)
	{
		System.out.println(a/b);
	}
	
}
