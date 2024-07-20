package loop_Statement;

//Summing numbers from 1 to 100:

public class While_SumOfNumbers {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while (i<=100) {
			
			sum+=i;
			i++;
		}
		
		System.out.println("Sum of numbers 1 to 100 is: "+sum);
	}
}
