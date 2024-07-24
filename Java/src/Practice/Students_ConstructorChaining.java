package Practice;

public class Students_ConstructorChaining extends Collage_ConstructorChaining{

	String sname;
	int sid;
	String semail;
	int rollno;
	
	Students_ConstructorChaining(String sname,int sid,String semail,int rollno){
		this.sname = sname;
		this.sid = sid;
		this.semail = semail;
		this.rollno = rollno;
	}
	
	// Now invoking the attributes of parent class by using Super() call statement.
	Students_ConstructorChaining(String cname,int cid,String cloc,String cstatus){
		super(cname,cid,cloc,cstatus);// super() call statement 
	}
	
	Students_ConstructorChaining(String cname,int cid,String cloc,String cstatus,String sname,int sid,String semail,int rollno){
		super(cname,cid,cloc,cstatus);// super() call statement
	    this.sname = sname;
	    this.sid = sid;
	    this.semail = semail;
	    this.rollno = rollno;
	}
	
	public Students_ConstructorChaining() {
		 
	}

	public void displayStudent() {
		System.out.println("Collage name; "+cname);
		System.out.println("Colage Id: "+cid);
		System.out.println("Collage loc; "+cloc);
		System.out.println("Col Status: "+cstatus);
		System.out.println("Student name: "+sname);
		System.out.println("S id : "+sid);
		System.out.println("Student email: "+semail);
		System.out.println("Roll no: "+rollno);
	}
	
	
	// Now creating an a object using new Keyword in Main method.
	
	public static void main(String[] args) {
		
		Students_ConstructorChaining s1  = new Students_ConstructorChaining();
		s1.displayStudent();
		
		System.out.println(" ");
		
		Students_ConstructorChaining s2  = new Students_ConstructorChaining("Fabtech Technical Campus",6756,"Sangola","Private Institute");
		s2.displayStudent();
		
		System.out.println(" ");
		
		Students_ConstructorChaining s3  = new Students_ConstructorChaining("Ganesh Pise",3307,"piseganesh2205@gmail.com",20);
		s3.displayStudent();
		
		System.out.println(" ");
		
		Students_ConstructorChaining s4  = new Students_ConstructorChaining("College of engg Pune",8786,"Pune","Government Institute","Rayesh Pise",6773,"rayeshpise09@gmail.com",07);
		s4.displayStudent();
		
		System.out.println(" ");
	}
	
}
