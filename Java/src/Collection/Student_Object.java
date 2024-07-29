package Collection;

import java.util.Arrays;

public class Student_Object {

	public static void main(String[] args) {
		
		Student  [] s = new Student[6];
		//String name,int id,String stream,int std,String email
		
		s[0] = new Student("Ganesh",1,"CSE","Fy","piseganesh2205@gmail.com");
		s[1] = new Student("Abhijit",2,"EnTC","Sy","abhirupnawar@gmail.com");
		s[2] = new Student("Sushant",3,"Mech","Ty","sushant33@gmail.com");
		s[3] = new Student("Onkar",4,"Civil","B.Tech","onkar123@gmail.com");
		s[4] = new Student("Sagar",5,"AIDS","Ty","sagar6@gmail.com");
		s[5] = new Student("Tanmay",6,"Mech","B.Tech","tanmay174@gmail.com");
		
		System.out.println(Arrays.toString(s));
		//System.out.println(s);
	}
}

