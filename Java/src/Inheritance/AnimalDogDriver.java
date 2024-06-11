package Inheritance;

public class AnimalDogDriver {

	public static void main(String[] args) {
		 
		Dog d1 = new Dog("Julie",4.5,"Rotwheeler","Friendly");
	     System.out.println("Name: "+d1.name);	
	     System.out.println("Age is: "+d1.age);
	     System.out.println("Breed of Dog: "+d1.breed);
	     System.out.println("Behaviour is: "+d1.behaviour); 
		 
         d1.age();
         d1.behaviour();
	     d1.breed();
	     d1.name();
	     
	     Animal a1 = d1;//upcasting
	     a1.name();
	     a1.age();
	    // a1.breed(); we can't do this bcz parent class can not access members/attributes of child class it throws CTE.
	    //a1.behaviour();
	}

}
