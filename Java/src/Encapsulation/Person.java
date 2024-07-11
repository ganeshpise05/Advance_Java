package Encapsulation;

public class Person {

	    private String name;
	    private int age;
	    private String address;
	    private long phoneNumber;
	    private String email;
	    private double weight;
	    private String gender;
	    
	    Person(){
	    	//No argument constructor.
	    }
	    
	    Person(String name,int age,String address,long phoneNumber,String email,double weight,String gender){
	    	this.name = name;
	    }
	    
	    // Getter and Setter methods for all above attributes.
	    public String getName() {
	    	return name;
	    }
	    
	    public int getAge() {
	    	return age;
	    }
	    
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(Long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight =  weight;
		}

}
