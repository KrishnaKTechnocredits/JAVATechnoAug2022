package jagruti;
class CalculatorWithParameter
{
	
	void add(int x, int y)
	{
		System.out.println("Addition of number1 and number2 is :"+ (x+y));
	}
	void sub(int x, int y)
	{
		System.out.println("Subtraction of number1 and number2 is :"+ (x-y));
	}
	void mult(int x, int y)
	{
		System.out.println("Multiplication of number1 and number2 is :"+ (x*y));
	}
	void div(int x, int y)
	{
		System.out.println("Division of number1 and number2 is :"+ (x/y));
	}
	public static void main(String[] args)
	{
		CalculatorWithParameter cal = new CalculatorWithParameter();
		cal.add(50,50);
		cal.sub(100,50);
		cal.mult(20,20);
		cal.div(500,10);
	}
	
}