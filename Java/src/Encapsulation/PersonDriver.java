package Encapsulation;

public class PersonDriver  {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		 // Setting attributes using setter methods
		p1.setName("Khushbuuu");
		p1.setAddress("Heaven");
		p1.setEmail("khushbuu05@gamil.com");
		p1.setPhoneNumber(7219712611l);
		p1.setWeight(50);
		
		System.out.println("\nPerson 1:");
		System.out.println("Name: "+p1.getName());
		System.out.println("Address: "+p1.getAddress());
		System.out.println("Email: "+p1.getEmail());
		System.out.println("Phone Number: "+p1.getPhoneNumber());
		System.out.println("Weight: "+p1.getWeight());
		
		Person p2 = new Person("Ganesh",21,"Dattwadi,Pune",8329988688l,"piseganesh2205@gmail.com",53.5,"Male"); 

        // Accessing attributes using getter methods
        System.out.println("\nPerson 2:");
        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
        System.out.println("Address: " + p2.getAddress());
        System.out.println("Phone Number: " + p2.getPhoneNumber());
        System.out.println("Email: " + p2.getEmail());
        System.out.println("Weight: " + p2.getWeight());
        System.out.println("Gender: " + p2.getGender());
	}
}

//String name,int age,String address,long phoneNumber,String email,double weight,String gender