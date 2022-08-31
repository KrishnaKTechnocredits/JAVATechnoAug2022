package amrutaSagne;

public class Calculation {

	double SimInt;

	void simpleInterest(int p, int t, double r) {
		SimInt = ((p * t * r) / 100);
		System.out.println("Simple interest for princliple " +p+ " for rate of " +r+ " and the duration " +t+ " is " + SimInt);
	}

	double celsius;

	void farToCel(double fahrenheit) {
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Conversion from " +fahrenheit+ " Fahrenheit to degree Celsius is " + celsius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		cal.simpleInterest(1000, 2, 5);
		cal.farToCel(100.5);
	}

}
