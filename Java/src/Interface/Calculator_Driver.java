package Interface;

public class Calculator_Driver {

	public static void main(String[] args) {
		 
		Calculator c1 = new Calculator_Impli();
		c1.add(1, 4);
		c1.sub(5, 4);
        c1.mul(2, 8);
        c1.div(10, 5);
        
        System.out.println(Calculator.pi);
	}

}
