/* Assignment - 11 : 30th Aug'2022
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

Note : double data type can store decimal numbers.*/

package deepakBorse.Assignments;

public class SimpleIntAndFtoC {

	void simpleIntrest(double amt, int timeyear, double rate) {
		double simpleint = 0;
		simpleint = (amt * timeyear * rate) / 100;
		System.out.println("Simple Intrest for Amount " + amt + " for " + timeyear + " year @rate of " + rate + " = " + simpleint);
	}

	void fahTocel(double fahrenheit) {
		double Celsius = 0;
		Celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Converted value from Fahrenheit " + fahrenheit + " = " + Celsius + " Celsius degree");
	}

	public static void main(String[] args) {
		SimpleIntAndFtoC SimpleIntAndFtoC1 = new SimpleIntAndFtoC();

		SimpleIntAndFtoC1.simpleIntrest(500000, 6, 2);
		SimpleIntAndFtoC1.fahTocel(105.5);
	}
	
}
