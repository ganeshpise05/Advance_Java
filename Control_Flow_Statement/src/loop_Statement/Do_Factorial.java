package loop_Statement;

//Calculating factorial using a do-while loop:

public class Do_Factorial {
	
	public static void main(String[] args) {
		
		int fact =1;
		int num=5;
		int i=1;
		
		do {
			fact*=i;
			i++;
		} while (i<=num);
		
		System.out.println("The factorial of Given number "+num+" is: "+fact);
	}

}
