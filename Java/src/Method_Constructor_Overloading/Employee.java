package Method_Constructor_Overloading;

public class Employee {
 
	    private int id;
	    private String name;
	    private double salary;

	    // Constructor with no parameters
	    public Employee() {
	        this.id = 0;
	        this.name = "Unknown";
	        this.salary = 0.0;
	    }

	    // Constructor with one parameter
	    public Employee(int id) {
	        this.id = id;
	        this.name = "Unknown";
	        this.salary = 0.0;
	    }

	    // Constructor with two parameters
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	        this.salary = 0.0;
	    }

	    // Constructor with three parameters
	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    public void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: $" + salary);
	    }

	    public static void main(String[] args) {
	        Employee emp1 = new Employee();
	        Employee emp2 = new Employee(1);
	        Employee emp3 = new Employee(2, "Alice");
	        Employee emp4 = new Employee(3, "Bob", 50000.0);

	        emp1.display();
	        System.out.println();
	        emp2.display();
	        System.out.println();
	        emp3.display();
	        System.out.println();
	        emp4.display();
	    }
 
}
