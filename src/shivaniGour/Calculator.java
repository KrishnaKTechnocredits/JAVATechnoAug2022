package shivaniGour;
class Calculator{
	int number1=10;
	int number2=5;
	void addition(){
		int sum = number1+number2;
		System.out.println("Addition of two numbers is: " + (sum));
	}
	
	void substraction(){
		int sub = number1-number2;
		System.out.println("Substraction of two numbers is: " + (sub));
	}
	
	void multiplication(){
		int mul = number1*number2;
		System.out.println("Multiplication of two numbers is: " + (mul));
	}
	
	void division(){
		float div = (float) number1/number2;
		System.out.println("Division of two numbers is: " + (div));
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
	}
}
     