package ObjectClass;

public class ObjectTheory {

	public static void main(String[] args) {
		 
		System.out.println("Object class is known as Supermost class of any class in Java..");
		System.out.println("Metthods of Object Class : ");
		System.out.println("1: public String toString() ->	returns the string representation of this object.");
		System.out.println("2: public boolean equals(Object obj) -> compares the given object to this object.");
		System.out.println("3: public int hashCode()->	returns the hashcode number for this object.");
		System.out.println("4: public final void wait()throws InterruptedException ->	causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).");
		System.out.println("5: public final void wait(long timeout,int nanos)throws InterruptedException ->	causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).");
		System.out.println("6: public final void wait(long timeout)throws InterruptedException ->	causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).");
		System.out.println("7: public final void notify() -> wakes up single thread, waiting on this object's monitor.");
		System.out.println("8: public final void notifyAll() -> wakes up all the threads, waiting on this object's monitor.");
		System.out.println("9: protected Object clone() throws CloneNotSupportedException -> creates and returns the exact copy (clone) of this object.");
		System.out.println("10:public final Class getClass() -> returns the Class class object of this object. The Class class can further be used to get the metadata of this class.");
		System.out.println("11: protected void finalize()throws Throwable -> is invoked by the garbage collector before object is being garbage collected.");
	}

}
