package hardikBhatia;

public class Calculator {
	int number1 = 10;
	int number2 = 5;
	int ans = 0;
	
	void add(){
		ans = number1 + number2;
		System.out.println("Addition is:" + ans);
	}
	
	void sub(){
		ans = number1 - number2;
		System.out.println("Subtraction is:" + ans);
	}
	
	void mul(){
		ans = number1 * number2;
		System.out.println("Multiplication is:" + ans);
	}
	
	void div(){
		ans = number1 / number2;
		System.out.println("Division is:" + ans);
	}
	
	public static void main(String[] args){
		Calculator c1 = new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}
}
