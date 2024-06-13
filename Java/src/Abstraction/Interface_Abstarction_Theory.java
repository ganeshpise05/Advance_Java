package Abstraction;

public class Interface_Abstarction_Theory {

	public static void main(String[] args) {
		 
		System.out.println("Abstraction: Hiding implementation detail and showing features");
		System.out.println("             Abstarct, non-static methods allowed in abstract class.");
		System.out.println("             We can't create object for an a abstract class");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Interface: It's nothing but extended version of abstraction ,used to achieve pure abstraction i.e 100%");
		System.out.println("           It contain only abstarct methods in parent class,members declared in parent class by default public");
		System.out.println("           It's not necessary to write the abstract & public keyword.");
		
		System.out.println("----------------NOTE----------------");
		System.out.println("Child class invokes ----> Parent class[Abstract class] Keyword extends");
		System.out.println("Child class invokes ----> Parent class[Interface class] Keyword implements");
	}

}
