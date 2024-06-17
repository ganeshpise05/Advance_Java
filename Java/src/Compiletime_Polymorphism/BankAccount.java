package Compiletime_Polymorphism;

public class BankAccount {
	
	    String accountNumber;
	    double balance;

	    // Constructor overloading
	    public BankAccount() {
	        this.accountNumber = "00000000";
	        this.balance = 0.0;
	    }

	    public BankAccount(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0;
	    }

	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Method overloading
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	    }

	    public void deposit(double amount, String currency) {
	        // Assuming a fixed exchange rate for simplicity
	        double exchangeRate = currency.equals("USD") ? 1 : 0.85; // USD to EUR conversion
	        balance += amount * exchangeRate;
	        System.out.println("Deposited: " + amount + " " + currency + ", New Balance: " + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
	    }
	

}
