/*
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
 */
package swatiM.assignments;

public class SimpleInterest {
	void calculateSimpleIntrest(double principle, double time, double rate) {
		double intrest = (principle * time * rate) / 100;
		System.out.println("Intreset is " + intrest);
	}

	void convertTemprature(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temprature in celsius is " + celsius);
	}

	public static void main(String[] args) {
		SimpleInterest simpleInterest = new SimpleInterest();
    	simpleInterest.calculateSimpleIntrest(126, 2, 9);
		simpleInterest.convertTemprature(98.3);
	}

}
