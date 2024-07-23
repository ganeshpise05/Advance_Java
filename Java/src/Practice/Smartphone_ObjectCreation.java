package Practice;

public class Smartphone_ObjectCreation {

	// Attributes
	String brand;
	String model;
	String os;
	int ram;
	int storage;
	int camera;
	String processor;
	long imei;
	
	Smartphone_ObjectCreation(){
	// No argument constructor.	
	}
	
	Smartphone_ObjectCreation(String brand,String model,String os,int ram,int storage,int camera,String processor,long imei){
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.ram = ram;
		this.storage = storage;
		this.camera = camera;
		this.processor = processor;
		this.imei = imei;
	}
	
	// This method is used to print by default values in the object
	public void displaySmartphone() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(os);
		System.out.println(ram);
		System.out.println(storage);
		System.out.println(camera);
		System.out.println(processor);
		System.out.println(imei);
	}
	
	// Actions
	
		public void makecall() {
			System.out.println("Dial the number & make call.");
		}
		
		public void sendText() {
			System.out.println("Type the text & send to our friend.");
		}
		
		public void takePhoto() {
			System.out.println("open the camera and click the picture.");
		}
		
		public void recordvideo() {
			System.out.println("Open camera and record the video.");
		}
		
		public void playmusic() {
			System.out.println("click on Spotify and play music");
		} 
		
		public void installApp() {
			System.out.println("Open playstore & install apps.");
		}
		
		public void chargeBattery() {
			System.out.println("Plug the charger & charge the mobile.");
		}

		public void lockScreen() {
			System.out.println("Press the lock button & switch off the phone.");
		}
		
		// Main method to create a Car object and perform actions
		
		public static void main(String[] args) {
			
			Smartphone_ObjectCreation s1  = new Smartphone_ObjectCreation();
			System.out.println(s1);// Prints address of object.
			s1.displaySmartphone();
		    System.out.println(s1.brand);
			System.out.println(s1.camera);
			
			System.out.println(" ");
			
			Smartphone_ObjectCreation s2  = new Smartphone_ObjectCreation("Vivo","Y51","Funtouch",8,128,48,"Snapdragon 885",4533454657657l);
		    s2.displaySmartphone(); // displaying object values.
		    
		    System.out.println("");
		    
		    // Now calling the non-Static methods.
		    s2.makecall();
		    s2.sendText();
		    s2.takePhoto();
		    s2.chargeBattery();
		 
			
		}
}
