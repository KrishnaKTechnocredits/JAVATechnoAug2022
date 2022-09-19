package pankajBhatt;

public class CalculateSimpleInterest {
	
	void calculateSI(double p, double r, double t){
		double si = (p * t * r) / 100;
		System.out.println("Simple Interest on Principle : "+p+", on rate : "+r+", for the time period of : "+t+" years is -> "+si);
	}
	
	void fahrenheitToCelsius(double fahrenheit) {
		double celsius = ( fahrenheit - 32 ) * 5 / 9 ;
		System.out.println("Tempreature of : "+fahrenheit+" Fahrenheit, in Celsius is "+celsius+".");		
	}

	public static void main(String[] args) {
		CalculateSimpleInterest calculateSimpleInterest = new CalculateSimpleInterest();
		calculateSimpleInterest.calculateSI(1300000, 8, 4);
		calculateSimpleInterest.fahrenheitToCelsius(98.2);
	}

}
