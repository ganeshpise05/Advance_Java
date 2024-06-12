package ObjectClass;

public class Student_Driver {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.toString());
		System.out.println(s1);
//		s1.toString();
		
		Student s2 = new Student(1,"Ganesh",33,8329988688l,null, 8.05,2024);
		System.out.println(s2.toString());
		
	}
}
