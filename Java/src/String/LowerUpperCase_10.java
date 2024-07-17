package String;

// Q.10> Convert lower Case to Upper Case and Upper case to Lower case.
// "GanEsH" -------> gANeSh

public class LowerUpperCase_10 {

	public static void main(String[] args) {
		
		String s = "GanEsH";
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch>='a' && ch<='z') {
				ans = ans + (char) (ch-32);
			}
			
			else if (ch>='A' && ch<='Z') {
				ans = ans + (char) (ch+32);
				
			}
		}
		System.out.println(ans);
	}
}
