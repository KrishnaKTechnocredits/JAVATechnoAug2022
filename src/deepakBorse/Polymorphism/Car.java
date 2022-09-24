package deepakBorse.Polymorphism;

public class Car {
	String name="";
	private static int speed=0;
	
	protected int speedup() {
		speed+=2;
		return speed;
	}
	
	int getSpeed() {
		return speed;
	}

}
