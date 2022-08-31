package komalShrivastava;

public class SimpleInterestandTemperature {

		void simpleInterest(double principle, int time, double rate) {
			double simpleInterest = (principle*time*rate)/100;
			System.out.println("Simple Interest for amount " + principle + " for duration " + time + " years at the interest rate of " + rate + "% is : " + simpleInterest);
		}
		
		void convertTemperature(int fahrenheit) {
			float Celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Temperature: Fahrenheit - " + fahrenheit + " and Celsius - " + Celsius );
		}
		
	public static void main(String[] args) {
		SimpleInterestandTemperature simpleInterestandTemperature = new SimpleInterestandTemperature();
		simpleInterestandTemperature.simpleInterest(500000, 2, 6.5);
		simpleInterestandTemperature.convertTemperature(100);		
	}
}