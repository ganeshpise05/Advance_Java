package ObjectClass;

public class CountryCity_Driver {

	public static void main(String[] args) {
		 
		City c1 = new City();
		System.out.println(c1.toString());
		
		City c2 = new City("India",1450000,"Pune",12000,"Murli Mohol");
		System.out.println(c2.toString());
		System.out.println(c2);
		
		Country co = c2;
		co.toString();
		System.out.println(co);
		
		Country c3 = new City();
		System.out.println(c3.toString());
		
		Country c4 = new City("America",1350000,"California",9000,"Barak Obama");
		System.out.println(c4.toString());//user defined constructor values passed by this statement 
		System.out.println(c4);//this is already present object was printed 

	}

}
