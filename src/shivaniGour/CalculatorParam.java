package shivaniGour;
class CalculatorParam{
	void addition(int a, int b){
		int sum = a+b;
		System.out.println("Addition of two numbers is: " + (sum));
	}
	
	void substraction(int c, int d){
		int sub = c-d;
		System.out.println("Substraction of two numbers is: " + (sub));
	}
	
	void multiplication(int e, int f){
		int mul = e*f;
		System.out.println("Multiplication of two numbers is: " + (mul));
	}
	
	void division(int g, int h){
		float div = (float) g/h;
		System.out.println("Division of two numbers is: " + (div));
	}
	
	public static void main(String[] args){
		CalculatorParam calculatorParam = new CalculatorParam();
		calculatorParam.addition(217,45);
		calculatorParam.substraction(887,76);
		calculatorParam.multiplication(87,12);
		calculatorParam.division(89,21);
	}
}
     