package hindaviIngle;
class Calculator
{
	int number1 = 10;
	int number2 = 5;
	int answer = 0;
	
	void add(){
		answer = number1+number2;
		System.out.println("Addition is "+answer);
	}
	
	void sub()
	{
		answer= number1-number2;
		System.out.println("subtraction is "+answer);
	}
	void mul()
	{
		answer=number1*number2;
		System.out.println("multiplication is "+answer);
	}
	void div()
	{
		answer=number1/number2;
		System.out.println("division is "+answer);
	}
public static void main(String[] a)
{
	Calculator calculator =new Calculator();
	calculator.add();
	calculator.sub();
	calculator.mul();
	calculator.div();
}
}