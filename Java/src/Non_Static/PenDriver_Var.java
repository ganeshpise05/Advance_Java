package Non_Static;

public class PenDriver_Var {

	public static void main(String[] args) {
		
		Pen_Var p1 = new Pen_Var("Cello","Blue",10,"Rubber","Glass",10);
		p1.displayPen();
		System.out.println(p1.brand);
	}
}
