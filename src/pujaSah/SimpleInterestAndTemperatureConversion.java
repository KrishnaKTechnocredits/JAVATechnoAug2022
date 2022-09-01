package pujaSah;

public class SimpleInterestAndTemperatureConversion {

	void calculateSimpleInterest(int principal, double rate, int time) {
		double simpleInterest = (principal * rate * time) / 100;
		System.out.println("Simple Interest for sum of " + principal + " for rate " + rate + " and time " + time + " is "
				+ simpleInterest);
	}

	void temperatureCalculation(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature " + fahrenheit + " in Celsius is " + celsius);
	}

	public static void main(String[] args) {
		SimpleInterestAndTemperatureConversion simpleInterestAndTemperatureConversion = new SimpleInterestAndTemperatureConversion();
		simpleInterestAndTemperatureConversion.calculateSimpleInterest(10000, 8.5, 3);
		simpleInterestAndTemperatureConversion.temperatureCalculation(260);
	}
}
