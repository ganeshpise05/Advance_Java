package Inheritance;

public class Student extends Human{

	int sid;
	double cgpa;
	
	public Student() {}
    
	Student(String name,String add,int sid,double cgpa)
	{
		super(name,add);
		this.sid=sid;
		this.cgpa=cgpa;
	}
	
	public void displayStudent()
	{
		System.out.println(sid);
		System.out.println(cgpa);
	}
}
