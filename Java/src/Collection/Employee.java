package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable <Employee> {

	String name;
	int age;
	String mail;
	double sal;
	
	public Employee () {}
	
	public Employee (String name,int age,String mail,double sal) {
		this.name = name;
		this.age= age;
		this.mail = mail;
		this.sal = sal;
	}
	
	public String toString() {
		return "Employee{name='" + name + "', age=" + age + ", mail='" + mail + "', sal=" + sal + "}";
	}
	@Override
	public int compareTo(Employee o) { 
		if (this.age > o.age) {
			return 1;
		}
		
		else if (this.age < o.age){
            return -1;
		}
		return 0;
	}
	
    // Main method for creating an object.
	
	public static void main(String[] args) {
		
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee("Ganesh",21,"piseganesh2205@gmail.com",1200000));
		e.add(new Employee("Abhijit",24,"abhirupnawar@gmail.com",9000000));
		e.add(new Employee("Sushant",23,"sushantpise07@gmail.com",3000000));
		e.add(new Employee("Sagar",22,"sagar@gmail.com",8000000));
		e.add(new Employee("Onkar",23,"onkark69@gmail.com",5000000));
		
		System.out.println(e);
		
		Collections.sort(e);
		
	    System.out.println(e);
	}
	
}
