package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Remove the elements in array list which ends with o.

public class Employee3 implements Comparable <Employee3> {

	String name;
	int age;
	double sal;
	
	Employee3 (){}
	
	Employee3 (String name,int age,double sal){
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public String toString() {
		return " [ Employee : name: '" + name + " ,age: '"+age+" ,sal: "+sal + " ] ";
	}
	@Override
	public int compareTo(Employee3 o) {
		return 0;
	}

	public static void main(String[] args) {
		
		ArrayList<Employee3> e = new ArrayList<Employee3>();
		e.add(new Employee3("Allen",20,14000));
		e.add(new Employee3("James",18,12000));
		e.add(new Employee3("Summer",19,18000));
		e.add(new Employee3("Alizabeth",23,14000));
		e.add(new Employee3("Grace",18,19000));
		e.add(new Employee3("Martin",28,200000));
		e.add(new Employee3("Jimmy",27,30000));
		e.add(new Employee3("Adeline",35,35000));
		e.add(new Employee3("Jacqueline",20,12000));
		e.add(new Employee3("Beth",34,34000));
		e.add(new Employee3("Parker",19,17000));
		
        System.out.println("Original list:"+e); 

        // Remove elements ending with 'o'
        Iterator<Employee3> iterator = e.iterator();
        while (iterator.hasNext()) {
            Employee3 e1 = iterator.next();
            if (e1.name.endsWith("e")) {
                iterator.remove();
            }
        }

        System.out.println("Modified list:"+ e); 
	}
	
}
