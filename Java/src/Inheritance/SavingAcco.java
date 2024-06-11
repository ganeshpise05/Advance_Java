package Inheritance;

public class SavingAcco extends Bank {

	 double interest;
	 int limit;
	 
	 public SavingAcco() {}

	 SavingAcco(long accno,double balance,double interest,int limit)
	 {
		 super(accno,balance);
		 this.interest=interest;
		 this.limit=limit;
	 }
	 
	 public void displayAcc()
	 {
		 System.out.println(interest);
		 System.out.println(limit);
	 }
}
