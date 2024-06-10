package Inheritance;

public class Collage extends University {
	
	String colprincipal;
	int colregno;
	String colname;
	String colloc;
	
	Collage()
	{
		System.out.println("From no argument constructor of collage");
	}
	
	Collage(String colprincipal,int colregno,String colname,String colloc , String vc , int regno , String name , String loc)
	{
		super(vc,regno,name,loc);
		this.colprincipal=colprincipal;
		this.colregno=colregno;
		this.colname=colname;
		this.colloc=colloc;
	}
	
	public void displayCollage()
	{
		System.out.println(colprincipal);
		System.out.println(colregno);
		System.out.println(colname);
		System.out.println(colloc);
	}

}
