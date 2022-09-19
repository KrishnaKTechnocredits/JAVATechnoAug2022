package ashishBramhe;

public class A11_ParameterizedMethodExample {
	
	void getSimpleInterest(int principleAmount, int termInYears, double rateOfInterest) {
		System.out.println("Simple Interest for Principle Amount " + principleAmount + ", Terms in Years " + termInYears + ", Rate of Interest : " + rateOfInterest + " is : Rs." + ((principleAmount*termInYears*rateOfInterest)/100));
	}
	
	void getCelsiusFromFahrenheit(double tempInFahrenheit) {
		System.out.println("Temperature in Celsius for Fahrenheit " + tempInFahrenheit + " is : " + ((tempInFahrenheit - 32)*5/9));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11_ParameterizedMethodExample a11_parameterizedMethodExample = new A11_ParameterizedMethodExample();
		a11_parameterizedMethodExample.getSimpleInterest(100, 5, 2.5);
		a11_parameterizedMethodExample.getCelsiusFromFahrenheit(32);
	}
}
