class Calculator{

	
	int ans=0;

	void add(int number1, int number2)
	{
		ans=number1+number2;
		System.out.println( "Addition of two Number is "+ans);
	
	}
	void sub(int x, int y)
	{
		ans=y-x;
		System.out.println("Substraction of two Number is "+ans);
	}
	void mult(int number1, int number2)
	{
		ans= number1*number2;
		System.out.println("Multiplication of two Number is "+ans);
	}
	void div(int x, int y)
	{
		int ans =y%x;
		System.out.println("Division of two Number is "+ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add(10,20);
		calculator.add(30,40);
		calculator.sub(10,20);
		calculator.mult(10,20);
		calculator.div (10,20);
		
	}
}
	

