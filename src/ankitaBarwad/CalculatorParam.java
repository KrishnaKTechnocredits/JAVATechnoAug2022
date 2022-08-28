package ankitaBarwad;

class CalculatorParam{
	
	void addition(int number1,int number2, int number3){
		System.out.println("Addition = " + (number1 + number2 + number3));
	}
	
	void subtraction(int number1,int number2){
		System.out.println("Subtraction = " + (number1 - number2));
	}
	
	void multiplication(int number1,int number2){
		System.out.println("Multiplication = " + (number1 * number2));
	}
	
	void division(int number1,int number2){
		System.out.println("Division = " + (number1 / number2));
	}
	
	public static void main(String[] args){
		CalculatorParam calculator = new CalculatorParam();
		calculator.addition(10,10,5);
		calculator.subtraction(10,5);
		calculator.multiplication(10,5);
		calculator.division(10,5);
	}
}