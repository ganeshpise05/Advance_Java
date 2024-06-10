package decision_Statement;

//Example 2: The given year is leapyear or not. 
public class IfElseLeapYear {
	 public static void main(String[] args) {
		
		 int year = 2020;
		 if ((year%4==0 && year%100!=0) || year%400==0) {
			 
			 System.out.println("The given year is leapyear.");
			
		} else {
			
			System.out.println("The given year is not leapyear");

		}
	}

}
