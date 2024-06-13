package Interface;

public class Animal_Driver {

	public static void main(String[] args) {
		 
		Animal a1 = new Animal_Imp();
		a1.eat();
		a1.sleep();
		a1.move();
		
		System.out.println(Animal.kingdome);
		System.out.println(Animal.origin);
		
		Animal_Imp i1 = new Animal_Imp("Radha",150,4);
		i1.displayAnimal();
		i1.eat();
		System.out.println(i1);//object ref id 

	}

}
