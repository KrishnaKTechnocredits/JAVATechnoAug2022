package deepakBorse.Polymorphism;

public class Swift extends Car {
	int speed = 0;
	
	protected int speedup() {
		speed = getSpeed() + 1;
		return getSpeed();
	}

	public static void main(String[] args) {
		Car car=new Swift();
		car.speedup();
		car=new Swift();
		car.speedup();
		car=new Swift();
		car.speedup();
		System.out.println(car.getSpeed());
	}
}
