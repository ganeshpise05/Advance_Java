package loop_Statement;

//Printing Fibonacci series:

public class While_FibonacciSeries {

	public static void main(String[] args) {
		
		int i=0;
		int a=0;
		int b=1;
		int num=20;
		
		while (i<num) {
			
			System.out.print(a+" ");
			
			int sum=a+b;
			a=b;
			b=sum;
			i++; 
			
		}
	}
}
