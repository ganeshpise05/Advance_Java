package String;

public class StringBuffer_Class {

	public static void main(String[] args) {
		 
		StringBuffer s1 = new StringBuffer("Ganesh");
		
        StringBuffer s2 = s1.append(" Pise");
        
        System.out.println(s1); // Old object value removed and new assigned in this method.
        System.out.println(s2);
	}
}
