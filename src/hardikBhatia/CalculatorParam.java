package hardikBhatia;

public class CalculatorParam {
	void add(int number1, int number2){
		System.out.println("Addition is:" + (number1 + number2));
	}
	
	void sub(int number1, int number2){
		System.out.println("Subtraction is:" + (number1 - number2));
	}
	
	void mul(int number1, int number2){
		System.out.println("Multiplication is:" + (number1 * number2));
	}
	
	void div(int number1, int number2){
		System.out.println("Division is:" + (number1 / number2));
	}
	
	public static void main(String[] args){
		CalculatorParam calculatorParam = new CalculatorParam();
		calculatorParam.add(20,10);
		calculatorParam.sub(20,10);
		calculatorParam.mul(20,10);
		calculatorParam.div(20,10);
	}
}
