package Inheritance;

public class While_Isprime {

	public static void main(String[] args) {
		 
		        int number = 29;
		        boolean isPrime = true;
		        int i = 2;
		        while (i <= number / 2) {
		            if (number % i == 0) {
		                isPrime = false;
		                break;
		            }
		            i++;
		        }
		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		     }
	}

}
