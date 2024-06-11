package Inheritance;

public class Bank {
	
	long accno;
	double balance;
	
	public Bank() {}

	Bank(long accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	
	public void displayBank()
	{
		System.out.println(accno);
		System.out.println(balance);
		System.out.println("---------------------");
	}
}
