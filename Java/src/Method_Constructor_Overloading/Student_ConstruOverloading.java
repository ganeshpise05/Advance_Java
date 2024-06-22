package Method_Constructor_Overloading;

public class Student_ConstruOverloading {
 
	    private int studentID;
	    private String name;
	    private int age;
	    private String major;

	    // Constructor with no parameters
	    public Student_ConstruOverloading() {
	        this.studentID = 0;
	        this.name = "Unknown";
	        this.age = 0;
	        this.major = "Undeclared";
	    }

	    // Constructor with one parameter (studentID)
	    public Student_ConstruOverloading(int studentID) {
	        this.studentID = studentID;
	        this.name = "Unknown";
	        this.age = 0;
	        this.major = "Undeclared";
	    }

	    // Constructor with two parameters (studentID, name)
	    public Student_ConstruOverloading(int studentID, String name) {
	        this.studentID = studentID;
	        this.name = name;
	        this.age = 0;
	        this.major = "Undeclared";
	    }

	    // Constructor with three parameters (studentID, name, age)
	    public Student_ConstruOverloading(int studentID, String name, int age) {
	        this.studentID = studentID;
	        this.name = name;
	        this.age = age;
	        this.major = "Undeclared";
	    }

	    // Constructor with four parameters (studentID, name, age, major)
	    public Student_ConstruOverloading(int studentID, String name, int age, String major) {
	        this.studentID = studentID;
	        this.name = name;
	        this.age = age;
	        this.major = major;
	    }

	    public void display() {
	        System.out.println("Student ID: " + studentID);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Major: " + major);
	    }

	    public static void main(String[] args) {
	    	Student_ConstruOverloading student1 = new Student_ConstruOverloading ();
	    	Student_ConstruOverloading student2 = new Student_ConstruOverloading(1);
	    	Student_ConstruOverloading student3 = new Student_ConstruOverloading(2, "Alice");
	    	Student_ConstruOverloading student4 = new Student_ConstruOverloading(3, "Bob", 20);
	    	Student_ConstruOverloading student5 = new Student_ConstruOverloading(4, "Charlie", 22, "Computer Science");

	        student1.display();
	        System.out.println();
	        student2.display();
	        System.out.println();
	        student3.display();
	        System.out.println();
	        student4.display();
	        System.out.println();
	        student5.display();
	    }
 
}
