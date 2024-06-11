package Inheritance;

public class Manager {
	
	int deptno;
	int teamsize;
	
	public Manager() {}
	
	Manager(int deptno,int teamsize)
	{
		this.deptno=deptno;
		this.teamsize=teamsize;
	}
	
	public void displayManager()
	{
		System.out.println(deptno);
		System.out.println(teamsize);
		System.out.println("---------------");
	}

}
