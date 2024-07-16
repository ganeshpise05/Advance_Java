package String;

// Upper case String : Give one string and convert the all lower case characters into upper case Characters.
// "Infosys" -----> "INFOSYS"

public class UppercaseString_7 {

	public static void main(String[] args) {
		
		String s = "Infosys";
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {
				ans = ans + (char) (ch-32);
			}
			else {
				ans = ans + ch;
			}
		}
		 
		System.out.println("Original String: "+s+" Is converted into upper Case: "+ans);
	}
}
