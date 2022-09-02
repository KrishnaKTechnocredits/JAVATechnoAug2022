package hindaviIngle;

public class SimpleInterest {
	
	void simpleInterest(int principal,double time,double rate) {
		double simpleInterest;
		simpleInterest=(principal * time * rate)/100;
		System.out.println("The simple interest is "+ simpleInterest);
	}
	void convertTemperatureToFahrenheit(double fahrenheit) {
		double celsius = ((fahrenheit - 32)*5)/9;
		System.out.println("Temprature in fahrenheit "+fahrenheit+"to celsius "+celsius);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest simpleInterest = new SimpleInterest();
		simpleInterest.simpleInterest(3500, 2.5,8.6);
		simpleInterest.convertTemperatureToFahrenheit(98.0);
	}

}
