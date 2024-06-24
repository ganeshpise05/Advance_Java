package loop_Statement;

public class Do_FibonacciSeries {

	public static void main(String[] args) {
		
		int n = 10;
		int a = 0, b = 1;
		int i = 0;
		
		do {
		    System.out.print(a + " ");
		    int sum = a + b;
		    a = b;
		    b = sum;
		    i++;
		} 
		
		while (i < n);

	}
}
