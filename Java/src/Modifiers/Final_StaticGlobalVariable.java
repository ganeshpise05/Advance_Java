package Modifiers;

public class Final_StaticGlobalVariable {
	
	 static final int a = 100;
//	 static final char ch ;// CTE we can't write any final global var without declaration 	
	 
//	 It's possible when this variable declared in static block.
	 static final String str;
	 static {
		 str ="Ganesh";
	 }

//    Another approach to declare given variable is Using constructor.	 
     static final long phno ;
	 public Final_StaticGlobalVariable (){
		 phno = 8329988688l;
	 }
	
	
	public static void main(String[] args) {
		
        
		System.out.println("The global static final var value is: "+a);
		
//		a = 120; //CTE We can't reasign variable.
//		System.out.println(a);
		
//		System.out.println("The given character is: "+ch); CTE
		
		System.out.println("The given string is declared in static block is: "+str);
		
//		str ="Pise";//CTE can't reinitialize.
//		System.out.println("New string is: "+str);
		
		System.out.println("The phno declared in constructor is: "+ phno);
	}

}
