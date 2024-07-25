package Polymorphism;

public class compassbox {
	public static void main(String[] args) {
		makeStationary pen1 = new makeStationary();
		makeStationary pen2 = new makeStationary();
		pen1.pen(true);
//		System.out.println(\n);
		pen2.pen(true,false);
	}
}
class makeStationary{
	boolean canWrite;
	boolean canErase;
	
	public void pen(boolean write) {
		this.canWrite = write;
		System.out.println(this.canWrite);
	}
	public void pen(boolean write,boolean erase) {
		this.canWrite = write; // Assigns the value to the instance variable
        this.canErase = erase;
		System.out.println(this.canWrite);
		System.out.println(this.canErase);
	}
}
