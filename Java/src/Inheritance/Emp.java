package Inheritance;

public class Emp extends Manager {
	
	String name;
	int sal;
	
	public Emp() {}
	
	Emp(int deptno,int teamsize,String name,int sal)
	{
	  super(deptno,teamsize);
	  this.name=name;
	  this.sal=sal;
	}
	
	public void displayEmp()
	{
		System.out.println(name);
		System.out.println(sal);
	}

}
