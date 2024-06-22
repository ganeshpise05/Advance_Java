package Method_Variable_Shadowing;

public class TheoryMethod_Variable_Shadowing {

	public static void main(String[] args) {
		
		System.out.println("                              BELOW ALL OPERATIONS DONE IN TWO CLASSES                                                       ");
		System.out.println("      ");
		
		System.out.println("Method Shadowing: If we have static methods with same signature in both super and sub class (parent & child).");
		System.out.println("   ");
		System.out.println("Rules: The preference is given to the ----parent class-----not a child class.Bcz method shadowing is compiletime polymorphism.");
		System.out.println("       The execution of method defination is does not depend on the type of object created instead it depends on type of referance used to invoke the method. ");
		System.out.println("  -----------------------------------------------------------------------------------------------------------------------------------------------------------------    ");
		
		System.out.println("Variable Shadowing: If we have static/non-static variables with same signature in both super and sub class is known as Variable Shadowing.");
		System.out.println("      ");
		System.out.println("Rule: The preference is given to the --parent class-- not a child class members/var.");
		System.out.println("      Bcz it is the compiletime polymorphism.");
		System.out.println("      The execution of var defination is does not depend on the type of object created instead it depends on type of variable is used to invoke the variable.");
		
		System.out.println("      ");
		System.out.println("                               PARENT CLASS MEMBERS(MEHTODS & VARIABLES) ARE EXECUTED                            ");
	}

}
