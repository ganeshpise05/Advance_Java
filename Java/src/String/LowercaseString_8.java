package String;

// Lower case String : Convert the upper case characters into Lower case characters.
// "ACCEnTurE" ------> accenture 

public class LowercaseString_8 {

	public static void main(String[] args) {
       
		String s = "AcCEnTurE";
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if (ch>='A' && ch<='Z') {
				ans = ans + (char) (ch+32);
			} 
			else {
                ans = ans + ch;
                // ans+=ch;
			}
		}
		System.out.println(s+" Converted into: "+ans);
	}
}
