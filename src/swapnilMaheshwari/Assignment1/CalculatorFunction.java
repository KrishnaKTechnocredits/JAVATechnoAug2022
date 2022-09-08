package swapnilMaheshwari;

class CalculatorFunction
{
	void addition(int a, int b)
	{
		System.out.println("The sum of two number is :"+(a+b));
	}
	
	void substraction(int a , int b)
	{
		System.out.println("The substraction of two number is :"+(a-b));
	}
	
	void multiplication (int a , int b)
	{
		System.out.println("The multiplication of two number is :"+(a*b));
	}
	
	void division(int a, int b)
	{
		System.out.println("The division of two number is :"+(a/b));
	}
	
	public static void main ( String [] args)
	{
		
		CalculatorFunction calculatorFunction = new CalculatorFunction();
		calculatorFunction.addition(10,12);
		calculatorFunction.substraction(14,5);
		calculatorFunction.multiplication(8,7);
		calculatorFunction.division(12,2);
	}
}