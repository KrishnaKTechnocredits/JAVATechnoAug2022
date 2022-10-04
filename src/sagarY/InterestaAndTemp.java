package sagarY;

public class InterestaAndTemp {
	
	void interest(int principle, double time, double iRate) {
		double interest=(principle*time*iRate)/100;
		System.out.println("Simple Interest for Rs " +principle+ " for " +time+ " years with interest rate " +iRate+ " is: " +interest);
	}
	
	void tempConvert(double farenheit) {
		double celsius= ((farenheit-32)*5)/9;
		System.out.println("Converted temperature from Farenheit (" +farenheit+ "f) to Celsius is : " +celsius);
	}
	
	public static void main(String[] args) {
		InterestaAndTemp interestaAndTemp = new InterestaAndTemp();
		interestaAndTemp.interest(2000, 3.5, 12.5);
		interestaAndTemp.tempConvert(90.5);
		
	}

}
