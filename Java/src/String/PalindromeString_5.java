package String;
 

public class PalindromeString_5 {

	public static void main(String[] args) {
		
		String s = "aba";
		
		int i,j;
		for ( i = 0 , j = s.length()-1; i < j ; i++ , j-- ) {
			if (s.charAt(i) != s.charAt(j)) {
				 break;
			 }
		}
		
		if (i>=j) {
			System.out.println("It is a palindrome string.");
		}
		else {
           System.out.println("Not a palindrome string.");
		}
	}
}
