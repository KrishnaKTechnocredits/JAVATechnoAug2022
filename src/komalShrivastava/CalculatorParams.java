package komalShrivastava;

class CalculatorParams{

	int ans = 0;
	
	void addition(int number1, int number2){
		ans = number1+number2;
		System.out.println("Addition of " + number1 + " and " + number2 +" = " + ans);
	}
	
	void substraction(int number1, int number2){
		ans = number1-number2;
		System.out.println("Substraction of " + number1 + " and " + number2 + " = " + ans);
	}
	
	void multiplication(int number1, int number2){
		ans = number1*number2;
		System.out.println("Multiplication of " + number1 + " and " + number2 + " = " + ans);
	}
	
	void division(int number1, int number2){
		ans = number1/number2;
		System.out.println("Division of " + number1 + " and " + number2 + " = " + ans);
	}
	
	public static void main (String[] args){
		
		CalculatorParams calculatorParams = new CalculatorParams();
		calculatorParams.addition(10, 20);
		calculatorParams.substraction(30, 40);
		calculatorParams.multiplication(50, 60);
		calculatorParams.division(100, 10);
	}
}	
	