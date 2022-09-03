package swatiM.assignments;
class Calculator {
	int number1=10; // instance variabl
	int number2=5;  // instance variabl
	//int ans=0;
	void addition() {
		int ans = number1+number2; // and local variable 
		System.out.println("Addition is  " +ans);
	}
	void subtraction() {
		int ans = number1-number2; // and local variable 
		System.out.println("Substraction is  " +ans);
	}
	void multiplication() {
		int ans = number1*number2; // and local variable 
		System.out.println("Multiplication is  " +ans);
	}
	void division() {
		int ans = number1/number2; // and local variable 
		System.out.println("Division is  " +ans);
	}
	public static void main(String[] a){
		Calculator calculator = new Calculator();
		calculator.addition();
		calculator.subtraction();
		calculator.multiplication();
		calculator.division();
	}
}