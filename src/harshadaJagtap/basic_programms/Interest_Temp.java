package harshadaJagtap.basic_programms;

public class Interest_Temp {

	void calInterest(double principle, double timeYears, double rate) {
		double interest=0;		
		interest=(principle*timeYears*rate)/100;
		System.out.println("Interest is = "+ interest);
	}
	
	void convertTemp(double tempInFahrenheit) {
		double tempInCelsius=0;
		tempInCelsius=(tempInFahrenheit-32)*5/9;
		System.out.println("Temperature in Celsius = " + tempInCelsius);
	}
	
	public static void main(String[] args) {
		Interest_Temp interestTemp= new Interest_Temp();
		interestTemp.calInterest(50000,1.5,5.1);
		interestTemp.convertTemp(64);
	}
	
}
