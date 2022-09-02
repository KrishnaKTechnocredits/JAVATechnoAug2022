//Calculator by parameters passing with two variable 
package akankshaVyas.basicExamples;
class CalculatorParameter{

	void addition(int x,int y){
		System.out.println("Addition is " + (x+y));
	}
	
	void subtraction(int x,int y){
		System.out.println("Subtraction is " + (x-y));
	}
	
	void multiplication(int x,int y){
		System.out.println("Multiplicatin is " + (x*y));
	}
	
	void division(int x, int y){
		System.out.println("Division is " + (x/y));
	}
	
	public static void main(String[] args){
		CalculatorParameter calculatorParameter = new CalculatorParameter();
		calculatorParameter.addition(100,20);
		calculatorParameter.subtraction(100,50);
		calculatorParameter.multiplication(10,10);
		calculatorParameter.division(50,5);
	}
}