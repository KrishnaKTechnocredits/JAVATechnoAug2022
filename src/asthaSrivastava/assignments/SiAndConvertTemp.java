/*Please create new branch for below assignment.
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
package asthaSrivastava.assignments;

public class SiAndConvertTemp {
	void simpleInterest( int p, int r,int t){ 
		double si;								
		si = ((p*r*t)/100);
		System.out.println("Simple Interest is "+ si); 
	}	
	
	void convertTemp( double fahrenheit ){   
		double celsius ;  					
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature is "+ celsius); 
	}
	
	public static void main(String[] args) {
		SiAndConvertTemp findSiAndTemp = new SiAndConvertTemp();
		findSiAndTemp.simpleInterest(100,30,10);
		findSiAndTemp.convertTemp(82);
	}

}
