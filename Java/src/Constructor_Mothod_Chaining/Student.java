package Constructor_Mothod_Chaining;

public class Student {
	
	int id;
	String fname;
	String lname;
	String dob;
	String email;
	int yop;
	
	String gender;
	double cgpa;
	double height;
	double weight;
	String nationality;
	long phno;
	
	Student(){
		
	}
	 
    Student(int id,String fname,String lname,String dob,String email,int yop){
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.dob=dob;
		this.email=email;
		this.yop=yop;
	}
    
    Student(int id,String fname,String lname,String dob,String email,int yop,String gender){
    	
    	this(id,fname,lname,dob,email,yop);
    	this.gender=gender;
    }
    
    Student(int id,String fname,String lname,String dob,String email,int yop,String gender,double cgpa){
    	
    	this(id,fname,lname,dob,email,yop,gender);
    	this.cgpa=cgpa;
    }
    
    Student(int id,String fname,String lname,String dob,String email,int yop,String gender,double cgpa,double height){
    	this(id,fname,lname,dob,email,yop,gender,cgpa);
    	this.height=height;
    }
    
    Student(int id,String fname,String lname,String dob,String email,int yop,String gender,double cgpa,double height,double weight){
    	this(id,fname,lname,dob,email,yop,gender,cgpa,height);
    	this.weight=weight;
    }
    
    Student(int id,String fname,String lname,String dob,String email,int yop,String gender,double cgpa,double height,double weight,String nationality){
    	this(id,fname,lname,dob,email,yop,gender,cgpa,height,weight);
    	this.nationality=nationality;
    }
    
    Student(int id,String fname,String lname,String dob,String email,int yop,String gender,double cgpa,double height,double weight,String nationality,long phno){
    	this(id,fname,lname,dob,email,yop,gender,cgpa,height,weight,nationality);
    	this.phno=phno;
    }
    public void displayStudent() {
    	System.out.println(id);
    	System.out.println(fname);
    	System.out.println(lname);
    	System.out.println(dob);
    	System.out.println(email);
    	System.out.println(yop);
    	System.out.println(gender);
    	System.out.println(cgpa);
    	System.out.println(height);
    	System.out.println(weight);
    	System.out.println(nationality);
    	System.out.println(nationality);
    	System.out.println("----------------------------");
    }

}


