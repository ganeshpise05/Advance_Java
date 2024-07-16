package String;

// Q.6> Reverse String: Give an one String and reverse the given String.
// "Ganesh" -----> hsenag

public class ReverseString_6 {

	public static void main(String[] args) {
		
		String s = "Ganesh";
		String ans = " ";
		
		for (int i = s.length()-1 ; i >= 0; i--) {
			ans = ans + s.charAt(i);
		}
		System.out.println(ans);
	}
}
