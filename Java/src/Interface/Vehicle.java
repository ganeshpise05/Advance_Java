package Interface;

public interface Vehicle {

	int maxSpeed = 100;
	int minSpeed = 0;
	
	void start();
	void stop();
	void accelerate(int speed);
	void brake(int speed);
}
