package aditiIngle;
class Calculator{

	int num1 = 10;
	int num2 = 5;
	int ans  = 0;
	
	void addition(){
		ans = num1 + num2;
		System.out.println("Addition of numbers is " + ans);
		}
	void subtraction(){
		ans = num1 - num2;
		System.out.println("Subtraction of numbers is " + ans);
		}
	void multiplication(){
		ans = num1 * num2;
		System.out.println("Multiplication of numbers is " + ans);
		}
	void division(){
		ans = num1 / num2;
		System.out.println("Division of numbers is " + ans);
		}
		
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.addition();
		c1.subtraction();
		c1.multiplication();
		c1.division();
	}
}