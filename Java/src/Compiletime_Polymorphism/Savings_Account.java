package Compiletime_Polymorphism;

public class Savings_Account extends BankAccount {
	
	double interestRate;

    // Constructor shadowing
    public Savings_Account() {
        super();
        this.interestRate = 0.02; // Default interest rate
    }

    public Savings_Account(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method shadowing
    @Override
    public void displayBalance() {
        System.out.println("Savings Account Number: " + accountNumber + ", Balance: " + balance + ", Interest Rate: " + interestRate);
    }

    // Variable shadowing
    public void calculateInterest() {
        double interest = balance * interestRate;
        double balance = this.balance + interest; // Shadows the instance variable 'balance'
        System.out.println("Interest: " + interest + ", New Balance after Interest: " + balance);
    }

}
