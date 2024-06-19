package Exception;

//Example 2: Handling NullPointerException

public class Nullpointer {
	public static void main(String[] args) {
		
		try {
			
			String str=null; 
			System.out.println(str.length());
			//System.out.println(str);
		} 
		
		catch ( NullPointerException ne) {
			 System.out.println("You can not declare any variable value as null.");
		}
	}
	
}
