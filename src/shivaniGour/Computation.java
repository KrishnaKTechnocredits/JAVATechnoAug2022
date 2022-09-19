package shivaniGour;

public class Computation {

	void simpleInterest(int principle, int time, int rate) {
		float si = (float) (principle * time * rate) / 100;
		System.out.println("Simple Interest = " + si + " for - \nPrinciple amount:" + principle + "\nTime:" + time
				+ "\nRate:" + rate);
	}

	void convertTemp(int fahrenheit) {
		double celsius = (double) ((fahrenheit - 32) * 5) / 9;
		System.out.println("\nFahrenheit to Celsius conversion:");
		System.out.println(fahrenheit + "\u00B0F is equal to " + celsius + "\u00B0C");

	}

	public static void main(String[] args) {
		new Computation().simpleInterest(1071399, 2, 3);
		new Computation().convertTemp(123);

	}
}
