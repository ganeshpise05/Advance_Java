package String;

// Sum of Digits in String: Give one string sum the digits of in given String.
//   "ab 2 d 3 n 467 b 6787 bkl 65 l 4" -------------> sum
public class SumOf_DigitsinString {

	public static void main(String[] args) {
		
		String s = "ab2d3n467b6787bkl65l4";
		
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			
			if (ch>='0' && ch<='9') {
				sum = sum + ch;
			}
		}
		System.out.println("Sum of digits in given String is: "+sum);
	}
}
