package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Student_Hash1 {

    int id;
    String name;
    int age;
    String grade;
    String div;

    // Default Constructor
    Student_Hash1() {}

    // Parameterized Constructor
    Student_Hash1(int id, String name, int age, String grade, String div) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.div = div;
    }

    @Override
    public String toString() {
        return " [ Student: Id: '" + id + "', Name: '" + name + "', Age: " + age + ", Grade: '" + grade + "', Div: '" + div + "'] ";
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
        // Create a HashSet of Student objects
        HashSet<Student_Hash1> students = new HashSet<>();

        // Add Student objects to the set
        students.add(new Student_Hash1(1, "Alice", 20, "Sophomore", "A"));
        students.add(new Student_Hash1(2, "Bob", 21, "Junior", "B"));
        students.add(new Student_Hash1(3, "Charlie", 22, "Senior", "C"));
        students.add(new Student_Hash1(3, "Charlie", 22, "Senior", "C")); // Duplicate entry
        students.add(new Student_Hash1(4, "Diana", 19, "Freshman", "A"));
        students.add(new Student_Hash1(5, "Eve", 20, "Sophomore", "B"));
        students.add(new Student_Hash1(5, "Eve", 20, "Sophomore", "B")); // Duplicate entry

        // Convert the HashSet to a List
        List<Student_Hash1> studentList = new ArrayList<>(students);
        
       // Shuffle the list
        Collections.shuffle(studentList);
        System.out.println(studentList); 
        
        System.out.println(Collections.emptyList());

        // Print the set of students
        for (Student_Hash1 s : students) {
            System.out.println(s);
        }
    }
}

