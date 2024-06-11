package Inheritance;

public class ManagerEmpdriver {

	public static void main(String[] args) {
		 
		Emp e1 = new Emp(12,01,"Ganesh",45000);
		e1.displayEmp();
		e1.displayManager();
		
		Manager m1 = e1;//upcasting
		m1.displayManager();
	}

}
