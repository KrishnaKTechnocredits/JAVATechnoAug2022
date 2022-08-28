package komalShrivastava;

class Calculator{

	int number1=10;
	int number2=5;
	int ans;
	
	void addition(){
		ans = number1+number2;
		System.out.println("Addition of " + number1 + " and " + number2 +" = " + ans);
	}
	
	void substraction(){
		ans = number1-number2;
		System.out.println("Substraction of " + number1 + " and " + number2 + " = " + ans);
	}
	
	void multiplication(){
		ans = number1*number2;
		System.out.println("Multiplication of " + number1 + " and " + number2 + " = " + ans);
	}
	
	void division(){
		ans = number1/number2;
		System.out.println("Division of " + number1 + " and " + number2 + " = " + ans);
	}
	
	public static void main (String[] args){
		Calculator cal = new Calculator();
		cal.addition();
		cal.substraction();
		cal.multiplication();
		cal.division();
	}
}	
	