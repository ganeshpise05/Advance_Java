package Inheritance;

public class SuperClass2 extends SuperClass1 {

	 int rollno;
	 String blood;
	 
	 SuperClass2()
	 {
		 System.out.println("From super class 2");
	 }
	 
	 SuperClass2( int prn,String name,String add,int rollno,String blood)
	 {
		 super(prn,name,add);
		 this.rollno=rollno;
		 this.blood=blood;
	 }
	 
	 public void displaySuperClass2()
	 {
		 System.out.println(rollno);
		 System.out.println(blood);
	 }
}
