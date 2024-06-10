package Inheritance;

public class CollageUniversityDriver {
	
	public static void main(String[] args) {
		
		Collage c1 = new Collage();
		c1.displayCollage();
		
		University u2 = new University();
		u2.displayUniversity();
		
		Collage c2 = new Collage("Shendage.R.B",1234,"FTC Sangola","Sangola","Rajmohan Roy",8976,"DBAT University","Lonere");
		c2.displayCollage();
		
	    Collage u1 = new Collage ("Shendage.R.B",1234,"FTC Sangola","Sangola","Rajmohan Roy",8976,"DBAT University","Lonere");
		u1.displayUniversity();
		
		Collage c3 = new Collage("Pawar.A.S",6745,"Sveri Collage","Pandharpur","Disha Pathan",92973," PAH University","Solapur");
		c3.displayCollage();
	}

}
 