package aditiIngle;
class Calculator1{

	void addition(int x , int y, int z){
		System.out.println("Addition of numbers is " + (x+y+z));
		}
	void subtraction(int x , int y, int z){
		System.out.println("Subtraction of numbers is " + ((x-y)-z));
		}
	void multiplication(int x , int y){
		System.out.println("Multiplication of numbers is " + (x*y));
		}
	void division(int x , int y){
		System.out.println("Division of numbers is " + (x/y));
		}
		
	public static void main(String[] args){
		Calculator1 calculator = new Calculator1();
		calculator.addition(10,5,5);
		calculator.subtraction(20,10,5);
		calculator.multiplication(25,2);
		calculator.division(10,2);
	}
}