package String;

public class Str4 {

	public static void main(String[] args) {
		
		String s1 ="Sheela";
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			s2 = s2+s1.charAt(i);
		}
		
		System.out.println(s1==s2);
		System.out.println(s2);
		System.out.println(s1);
	}
}
