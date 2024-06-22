package Constructor_Mothod_Chaining;

public class Student_Driver {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.displayStudent();
		
		//id,fname,lname,dob,email,yop,gender,cgpa,height,weight,nationality
		Student s2 = new Student(1,"Ganesh","Pise","22/05/2003", "pisegganesh2205@gmail.com",2024);
		s2.displayStudent();
		
		Student s3 = new Student(2,"Ajay","Pise","09/05/2001","ajaypise@gmail.com",2023,"Male",7.5,5.5,65.40,"Indian",7119711611l);
		s3.displayStudent();
	}
}
