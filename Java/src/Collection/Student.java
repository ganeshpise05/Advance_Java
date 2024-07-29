package Collection;

// Create Blueprint of Student & add elements by creating an a object.

public class Student {

	String name;
	int id;
	String stream;
	String std;
	String email;
	
	public Student() {
		
	}
	
	public Student(String name,int id,String stream,String std,String email) {
		this.name = name;
		this.id = id;
		this.stream = stream;
		this.std = std;
		this.email = email;
	}
	
	 // Override toString() method to provide a meaningful representation
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", stream='" + stream + "', std='" + std + "', email='" + email + "'}";
    }
}
