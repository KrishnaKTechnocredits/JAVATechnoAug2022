package swatiM;
class CalculatorNew {
	void addition(int x,int y) {
		int ans = x+y;  
		System.out.println("Addition is  " +ans);
	}
	void subtraction(int x,int y) {
		int ans = x-y; 
		System.out.println("Substraction is  " +ans);
	}
	void multiplication(int x,int y) {
		int ans = x*y; // and local variable 
		System.out.println("Multiplication is  " +ans);
	}
	void division(int x,int y) {
		int ans = x/y; // and local variable 
		System.out.println("Division is  " +ans);
	}
	public static void main(String[] a){
		CalculatorNew calculatorNew = new CalculatorNew();
		calculatorNew.addition(10,20);
		calculatorNew.subtraction(30,10);
		calculatorNew.multiplication(40,20);
		calculatorNew.division(40,20);
	}
}