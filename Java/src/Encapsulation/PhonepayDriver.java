package Encapsulation;

public class PhonepayDriver {
	
	public static void main(String[] args) {
		
		Phonepay p1 = new Phonepay("Ganesh",1234567890l,2000.0,1234,10000,6789,"22/05/2025",9588,"boi@2205lyb");
		p1.getAccno();
		
		Phonepay p3 = new Phonepay();
		p3.setWallet(1234567890l, 1234, 3000);
		
		Phonepay p2 = new Phonepay();
		p2.setPin(1234567890l, 1234, 3456);
		
	}
}

//String name,long accno,double amt,int pin,double wallet,int cardno,String expdate,int cvv,String upiid