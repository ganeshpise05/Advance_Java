package Practice;

// Constructor Chaining: It's done by using the super() call statement 
// Here are we uses the two classes parent and child class. 
// College is parent class and students are child class (Students extends College)

public class Collage_ConstructorChaining {

	String cname;
	int cid;
	String cloc;
	String cstatus;
	
	Collage_ConstructorChaining(){
		
	}
	
	// collage class constructor 
	
	Collage_ConstructorChaining(String cname,int cid,String cloc,String cstatus){
		this.cname = cname;
		this.cid = cid;
		this.cloc = cloc;
		this.cstatus = cstatus;
	}
	
}
