package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee2 implements Comparable <Employee2> {

	String name;
	int age;
	double sal;
	
	public Employee2() {}
	
	public Employee2(String name,int age,double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
	    return "Employee : name='" + name + "', age=" + age +"', sal=" + sal;
	}
	
	public int compareTo(Employee2 o) {
		
		if (this.sal > o.sal) {
			return 1;
		}
		
		else if (this.sal < o.sal) {
			return -1;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Employee2> e = new ArrayList<Employee2>();
		e.add(new Employee2("Golu",21,52000));
		e.add(new Employee2("Molu",24,32000));
		e.add(new Employee2("Funtya",20,22000));
		e.add(new Employee2("Pink Panther",18,19000));
		e.add(new Employee2("Dholu",32,17000));
		e.add(new Employee2("Bolu",17,16000));
		e.add(new Employee2("Kalu",21,13000));
		
		System.out.println(e);
		
		Collections.sort (e);
		System.out.println(e);
	}

}
