package snehalJojare;

class Calculator{
	int answer;
	
	void addition (int number1, int number2){
		answer = number1+number2;
		System.out.println("Addition is : "+answer); 
	}
	
	void substraction(int x, int y){
		answer = x-y;
		System.out.println("Substraction is : "+answer);
	}
	
	void multiplication(int number1, int number2){
		answer = number1*number2;
		System.out.println("Multiplication is :"+answer);
	}	
	
	void division(int div1, int div2){
		answer = div1/div2;
		System.out.println("Division is :"+answer);
	}
	
	public static void main (String[] args){
		Calculator calculator = new Calculator();
		calculator.addition(50,20); //Parameterized methods
		calculator.substraction(90,70);
		calculator.multiplication(9,4);
		calculator.division(20,5);
	}
}