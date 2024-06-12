package Inheritance;

public class While_FibonacciSeries {

	public static void main(String[] args) {
		 
		int end = 10;
		int a = 0 ;
		int b = 1;
		int start = 1;
		
		while (start<=end) {
			 System.out.print(a + " ");
	            int next = a + b;
	            a = b;
	            b = next;
	            start++;
		}
	}

}
