package loop_Statement;

//Printing even numbers between 1 and 20:

public class While_PrintEvenNum {

	public static void main(String[] args) {
		 
		int n =1;
		while ( n<=20) {
			
			if (n%2==0) {
				
				System.out.print(n+" ");
			} 
			n++;
		}
	}

}
