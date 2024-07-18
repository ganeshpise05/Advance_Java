package String;

// Q.1> Extract characters : Give one string and extract the Characters of given String.
// String s ="Funtya" ---------> F u n t y a

public class ExtractChar_1 {

	public static void main(String[] args) {
		
		String s = "Funtya";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i)+" ");
		}
	}
}
