package loop_Statement;

//Printing Fibonacci series using a do-while loop:

public class Do_Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int i=0;
		int n= 20;
		
		do {
			System.out.print(a+" ");
			int sum = a+b;
			a=b;
			b=sum;
			i++;
			
		} while (i<n);
	}
}
