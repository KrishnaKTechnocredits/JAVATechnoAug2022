//calculator 
package pranjaliV;

class ParCalculator{
	
	void add(int number1, int number2){
		System.out.println("Addition of "+ number1 + " and " + number2 + " is " + (number1 + number2));
	}
	
	void sub(int number1, int number2){
		System.out.println("Subtraction of " + number2 + " from " + number1 + " is " + (number1 - number2));
	}
	
	void mul(int number1, int number2){
		System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + (number1 * number2));
	}
	
	void div(int number1, int number2){
		System.out.println("Division of " + number1 + " and " + number2 + " is " + (number1 / number2));
	}
	
	public static void main(String[] args){
		ParCalculator cal = new ParCalculator();
		cal.add(20,10);
		cal.sub(20,10);
		cal.mul(20,10);
		cal.div(20,10);
	}	
}