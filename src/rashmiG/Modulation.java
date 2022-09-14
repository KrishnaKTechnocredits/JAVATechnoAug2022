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

package rashmiG;

class Modulation{
	void findSimpleInterst(int amount, int time, int rate){
		double simpleInterst = (amount*time*rate)/100;
		System.out.println("Simple interst is "+simpleInterst);
	}
	
	void fahToCelsius(double fahrenTemp){
		double celsiusTemp = (fahrenTemp-32) * 5/9;
		System.out.println("Temperature from Fahrenheit to Celsius degree :"+celsiusTemp);
	}
	
	public static void main(String[] args){
		Modulation modulation = new Modulation();
		modulation.findSimpleInterst(950000,2,4);
		modulation.fahToCelsius(78.3);
	}
}