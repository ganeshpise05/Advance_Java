package Inheritance;

public class While_ReverseofNum {

	public static void main(String[] args) {
		
		int num = 123456;
		int rev = 0;
		
		while (num>0) {
			int last = num%10;
			rev = rev*10+last;
			num/=10;
		}
           System.out.println(rev);
	}

}
