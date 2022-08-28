package pallaviRaut;
// Calculator Program With parameters Date 21 Aug 2022 Pallavi Raut
class Calculatorparam{
	int ans=0;
	
	void addition(int x, int y)
	{
		ans=x+y;
		System.out.println("Addition: " +x+ " + " +y+ " = " +ans);
	}
	
	void subtraction(int x, int y)
	{
		ans=x-y;
		System.out.println("Subtraction: " +x+ " - " +y+ " = " +ans);
	}
	
	void multiplication(int x, int y)
	{
		ans=x*y;
		System.out.println("Multiplication: " +x+ " X " +y+" = " +ans);
	}
	
	void division(int x, int y)
	{
		ans=x/y;
		System.out.println("Division: " +x+ " / " +y+" = " +ans);
	}
	
	
	public static void main(String[] args)
	{
		Calculatorparam calculatorparam= new Calculatorparam();
		System.out.println("Mathmatical Operations are as below:");
		calculatorparam.addition(100,25);
		calculatorparam.subtraction(25,100);
		calculatorparam.multiplication(20,30);
		calculatorparam.division(100,2);
		calculatorparam.addition(69,96);
		
	}	
}