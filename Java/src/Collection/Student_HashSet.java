package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Objects;

public class Student_HashSet  {

	int id;
	String name;
	int age;
	String grade;
    String div;
    
    Student_HashSet () {
    	
    }
    
  Student_HashSet (int id,String name,int age,String grade,String div) {
    	this.id = id;
    	this.name = name;
    	this.age = age;
    	this.grade = grade;
    	this.div = div;
    }
  
  public String toString() {
	  return " [ Student: Id: '"+id+" ,Name: '"+name+" ,Age: '"+age+" ,Grade: '"+grade+" ,Div: '"+div+" ] ";
  }
   
  @Override
  public int hashCode() {
      return Objects.hash(id);
  } 
  
  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student_Hash1 that = (Student_Hash1) o;
      return id == that.id;
  }
  
  public static void main(String[] args) {
      // Create an ArrayList of Student objects
       HashSet<Student_HashSet> students = new HashSet<Student_HashSet>();

      // Add Student objects to the list
      students.add(new Student_HashSet(1, "Alice", 20, "Sophomore", "A"));
      students.add(new Student_HashSet(2, "Bob", 21, "Junior", "B"));
      students.add(new Student_HashSet(3, "Charlie", 22, "Senior", "C"));
      students.add(new Student_HashSet(3, "Charlie", 22, "Senior", "C"));
      students.add(new Student_HashSet(4, "Diana", 19, "Freshman", "A"));
      students.add(new Student_HashSet(5, "Eve", 20, "Sophomore", "B"));
      students.add(new Student_HashSet(5, "Eve", 20, "Sophomore", "B"));

    
      for (Student_HashSet s : students) {
          System.out.println(s);
      }
  }	
}
