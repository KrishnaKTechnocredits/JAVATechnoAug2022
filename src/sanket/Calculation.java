/*Assignment 11 : Simple Interest and Fahrenheit to Celsius*/

package sanket;

public class Calculation{
	
	void simpleInterestCalculation (double principle, double time, double rate){
		
		double simpleInterest = 0.0;
		simpleInterest = (principle * time * rate) / 100;
		System.out.println("You simple interest calculated as : " + simpleInterest);
	}
	
	void celciusFahrenheitConversion(double value){
		
		double celsius = 0.0;
		celsius = (value - 32) * 5 / 9;
		System.out.println("The "+value+"F is converted value for Celsius is "+celsius+"C.");
	}
	
	public static void main (String[] args){
		Calculation calculation1 = new Calculation();
		calculation1.simpleInterestCalculation (1000.23, 2.5, 5.7);
		calculation1.celciusFahrenheitConversion(78.89);
	}
}