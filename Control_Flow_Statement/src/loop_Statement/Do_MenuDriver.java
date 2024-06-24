package loop_Statement;

import java.util.Scanner;

//Menu-driven program using a do-while loop

public class Do_MenuDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int choice;
		
		do {
		    System.out.println("1. Option 1");
		    System.out.println("2. Option 2");
		    System.out.println("3. Exit");
		    System.out.println("Enter your choice:");
		    choice = sc.nextInt();
		    
		    switch (choice) {
		        case 1:
		            System.out.println("You selected Option 1");
		            break;
		        case 2:
		            System.out.println("You selected Option 2");
		            break;
		        case 3:
		            System.out.println("Exiting program...");
		            break;
		        default:
		            System.out.println("Invalid choice, please try again");
		    }
		} 
		
		while (choice!=3);
		sc.close();
	}
  
}
