package adittyThakare;

class Calculator{
	
	void addition(int number1, int number2){
		System.out.println("Addition of "+number1+" and "+number2+" is: "+(number1+number2));
	}
	
	void subtraction(int number1, int number2){
		System.out.println("Subtraction of "+number1+" and "+number2+" is: "+(number1 - number2));
	}
	
	void multiplication(int number1, int number2){
		System.out.println("Multiplication of "+number1+" and "+number2+" is: "+(number1 * number2));
	}
	
	void division(int number1, int number2){	
		System.out.println("Addition of "+number1+" and "+number2+" is: "+(number1 / number2));
	}
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		calculator.addition(100,50);
		calculator.subtraction(200,80);
		calculator.multiplication(150,50);
		calculator.division(200,40);
	}		
}	