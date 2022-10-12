// Assignment-1:Calculator program

package apurvaBabel.Assignment1to10;

class Calculator{
	int number1 = 10;
	int number2 = 5;
	int ans = 0;
	
	void add(){
		ans = number1 + number2;
		System.out.println("Addition is " + ans);
	}
	
	void subtract(){
		ans = number1 - number2;
		System.out.println("Subtraction is " + ans);
	}
	
	void multiply(){
		ans = number1 * number2;
		System.out.println("Multiplication is " + ans);
	}
	
	void divide(){
		ans = number1 / number2;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.add();
		calculator.subtract();
		calculator.multiply();
		calculator.divide();
	}
}