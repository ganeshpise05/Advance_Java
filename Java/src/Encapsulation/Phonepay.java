package Encapsulation;

public class Phonepay {
	
	private String name;//get
	private long accno;
	private double amt;
	private int pin;//set
	private int wallet;//get set
	private int cardno;//get
	private String expdate;
	private int cvv;//card verification value
	private String upiid;//get 
	
	public Phonepay()
	{
		System.out.println("From no argument constructor of Phonepay");
	}
	
	Phonepay(String name,long accno,double amt,int pin,int wallet,int cardno,String expdate,int cvv,String upiid)
	{
		this.name=name;
		this.accno=accno;
		this.amt=amt;
		this.pin=pin;
		this.wallet=wallet;
		this.cardno=cardno;
		this.expdate=expdate;
		this.cvv=cvv;
		this.upiid=upiid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public long getAccno()
	{
		return accno;
	}
	
	public double getamt()
	{
		return amt;
	}
	
	public void setPin(long accno , int oldpin,int newpin)
	{
		if (this.accno==accno && this.pin==oldpin) {
			
			pin=newpin;
			System.out.println("Pin Updated"); 
		}
		else {
			System.out.println("Invalid credintial");
		}
	}
	
	public int getWallet()
	{
		return wallet;
	}
	
	public void setWallet(long accno,int pin ,double amt)
	{
		if (this.accno==accno && this.pin==pin && amt>0) {
			
			System.out.println("Login success");
			
			if ((wallet-amt)>1000) {
				
				wallet=(int) (wallet-amt);
				System.out.println(amt + "rs dedited from account");
				System.out.println("Your remaining balance is" + wallet);
			} else {
				System.out.println("Insufficient balance");
			} 	
		} else {
			System.out.println("Invalid Credential");
		}
	}
	
	public int getCardno()
	{
		return cardno;
	}
	
	public String getExpdate()
	{
		return expdate;
	}
	
	public int getCvv()
	{
		return cvv;
	}
	
	public String getUpiid()
	{
		return upiid;
	} 
}


