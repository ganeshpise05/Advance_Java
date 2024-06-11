package Inheritance;

public class HumanStudentDriver {

	public static void main(String[] args) {
		
		Student s1 = new Student ("Ganesh","San jose ,California",05,8.17);
		s1.displayStudent();
		s1.displayHuman();
		
		Human h1 = s1 ;//upcasting
		h1.displayHuman();

	}

}
