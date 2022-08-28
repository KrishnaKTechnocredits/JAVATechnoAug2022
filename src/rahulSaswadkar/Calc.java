package rahulSaswadkar;

class Calc{
	public static void main(String[] args){
		Calc calc = new Calc();
		calc.addition(10,5);
		calc.subtraction(10,5);
		calc.multiplication(10,5);
		calc.division(10,5);	
	}	
	
	//int a = 10;
	//int b = 5;
	//int ans;//Default value of 0 assigned to Integer type variable 'ans' 
	
	void addition(int a, int b){
		//ans = a + b;
        System.out.println("Addition result is : " + (a+b));		
	}
	
	void subtraction(int a, int b){
		//ans = a - b;
        System.out.println("Subtraction result is : " + (a-b));		
	}
	
	void multiplication(int a, int b){
		//ans = a * b;
        System.out.println("Multiplication result is : " + (a*b));		
	}
	
	void division(int a, int b){
		//ans = a / b;
        System.out.println("Division result is : " + (a/b));		
	}
	
}