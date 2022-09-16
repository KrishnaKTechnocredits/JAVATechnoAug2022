package swapnilMaheshwari.Assignment1;

public class SimpleInterestAndCelsicusCalculation {
	void simpleInterest(double p, double r, double t) {
		double si = (p * r * t) / 100;
		System.out.println("Simple interest is:" + si);
	}

	void celsius(double fahrenheit) {
		double cel = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius of the given fahrenheit is:" + cel);
	}

	public static void main(String[] args) {
		SimpleInterestAndCelsicusCalculation sIandCelsicus = new SimpleInterestAndCelsicusCalculation();
		sIandCelsicus.simpleInterest(1000, 10, 2);
		sIandCelsicus.celsius(400);
	}
}
