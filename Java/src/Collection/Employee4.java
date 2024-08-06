package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Employee4 implements Comparable<Employee4> {

	String name;
	int age;
	double sal;
	
	public Employee4() {}
	public Employee4(String name,int age, double sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public String toString() {
		return " [ Employee: name: '" + name + " ,age: '"+ age + " ,salary: '" + sal + "]";
	}
	@Override
	public int compareTo(Employee4 o) {
		 if (this.sal > o.sal) {
			return 1;
		} 
		 else if (this.sal < o.sal){
           return -1;
		}
		return 0;
	}

        public static void main(String[] args) {
		
		ArrayList<Employee4> e = new ArrayList<Employee4>();
		e.add(new Employee4("Allen",20,14000));
		e.add(new Employee4("James",18,12000));
		e.add(new Employee4("Summer",19,18000));
		e.add(new Employee4("Alizabeth",23,14000));
		e.add(new Employee4("Grace",18,19000));
		e.add(new Employee4("Martin",28,200000));
		e.add(new Employee4("Jimmy",27,30000));
		e.add(new Employee4("Adeline",35,35000));
		e.add(new Employee4("Jacqueline",20,12000));
		e.add(new Employee4("Beth",34,34000));
		e.add(new Employee4("Parker",19,17000));
		
        System.out.println("Original list:"+e); 
        
        Collections.sort(e);
        
        //System.out.println("The sorted list According to sal is: "+e);
        System.out.println("Sorted list: "+e);
        
        
      }
}
