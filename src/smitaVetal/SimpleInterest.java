package smitaVetal;

public class SimpleInterest {

	void calculateSI(double Principal, double Time, int Rate) {
		double SimpleInterest = 0;
		SimpleInterest = ((Principal * Rate * Time) / 100);
		System.out.println("Simple Interest is " + SimpleInterest);
	}
	
	void fahrenheit(double Temperature) {
		double Celsius = 0;
		Celsius = (Temperature - 32)*5/9;
		System.out.println("Conversion of Temperature " +Temperature+ "to Celsius is " +Celsius);		
	}
	
	public static void main(String[] args) {
		SimpleInterest SI = new SimpleInterest();
		SI.calculateSI(10000.50, 7.50,4);
		SI.fahrenheit(24);
	}

}
