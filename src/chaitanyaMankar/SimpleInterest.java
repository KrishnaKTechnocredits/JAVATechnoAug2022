/*Assignment - 11 : 30th Aug'2022

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

package chaitanyaMankar;

public class SimpleInterest 
{
	void simpleInt(double p,double t, double r)
	{
		double si;
		si=(p*t*r)/100;
		System.out.println("Simple Interest: "+si);
	}

	void tempConvert(double fahrenheit)
	{
		double Celsius;
		Celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature: "+Celsius);
	}
	
	public static void main(String[] args)
	{
		SimpleInterest simple_interest = new SimpleInterest();
		simple_interest.simpleInt(100.00, 20.0, 8.0);
		simple_interest.tempConvert(75.25);
	}
}
