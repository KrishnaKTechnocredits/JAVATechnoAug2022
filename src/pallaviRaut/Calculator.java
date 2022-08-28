package pallaviRaut;

// Calculator Program Simple  Date 20 Aug 2022 Pallavi Raut
class Calculator{
	int number1= 100;
	int number2= 50;
	int ans;
	
	void addition(){
		ans=number1+number2;
		System.out.println("Addition of "+number1+ " and " +number2+ " is ="+ans);
	}
	
	void subtraction()
	{
		ans=number1-number2;
		System.out.println("Subtraction of "+number1+ " and " +number2+ " is ="+ans);
	}
	void multiplication(){
		ans=number1* number2;
		System.out.println("Multiplication of "+number1+" and " +number2+" is ="+ans);
	}
	
	void division()
	{
		ans=number1/number2;
		System.out.println("Division of "+number1+" and " +number2+ " is ="+ans);
	}
	
	public static void main( String[] args)
	{
		Calculator cal= new Calculator();
		cal.addition();
		cal.subtraction();
		cal.multiplication();
		cal.division();
	}
}