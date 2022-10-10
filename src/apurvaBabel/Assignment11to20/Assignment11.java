/*Assignment - 11 :

Please create new branch for below assignment.
Create two parameterized methods in same class. 

Write a method to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate

 Write a method to convert temperature from Fahrenheit to Celsius degree.
	 Celsius = (fahrenheit - 32) * 5 / 9

Note : double data type can store decimal numbers.
*/

package apurvaBabel.Assignment11to20;

public class Assignment11 {

	// Method to compute simple interest
	void simpleInterest(double principleAmount, double year, double rate) {
		double simpleInterest = (principleAmount * year * rate) / 100;
		System.out.println("Simple Interest is " + simpleInterest + " per annum.");
	}

	// Method to convert temperature from Fahrenheit to Celsius degree
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
