package Compiletime_Polymorphism;

public class BankAccount_Driver {
	
	 public static void main(String[] args) {
	        // Demonstrate constructor overloading
	        BankAccount account1 = new BankAccount();
	        BankAccount account2 = new BankAccount("12345678");
	        BankAccount account3 = new BankAccount("87654321", 500.0);

	        // Demonstrate method overloading
	        account3.deposit(200);
	        account3.deposit(100, "USD");

	        // Demonstrate method shadowing
	        Savings_Account savingsAccount = new Savings_Account("11223344", 1000.0, 0.03);
	        savingsAccount.displayBalance(); // Calls SavingsAccount's displayBalance

	        // Demonstrate variable shadowing
	        savingsAccount.calculateInterest(); // Calculates interest and shows new balance
	    }

}
