package apurvaBabel;

public class Assignment11 {

	void simpleInterest(double principleAmount, double year, double rate) {
		double simpleInterest = (principleAmount * year * rate) / 100;
		System.out.println("Simple Interest is " + simpleInterest + " per annum.");
	}

	void convertTemperatureFromFahrenheitToCelsius(int fahrenheit) {
		int celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celsius is " + celsius + " degree.");
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.simpleInterest(500000, 3, 8.2);
		assignment11.convertTemperatureFromFahrenheitToCelsius(85);
	}
}
