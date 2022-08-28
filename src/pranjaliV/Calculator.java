//calculator 
package pranjaliV;

class Calculator{
	int number1 = 10;
	int number2 = 5;
	int ans = 0;
	
	void add(){
		ans = number1 + number2;
		System.out.println("Addition of "+ number1 + " and " + number2 + " is " +ans);
	}
	
	void sub(){
		ans = number1 - number2;
		System.out.println("Subtraction of " + number2 + " from " + number1 + " is " + ans);
	}
	
	void mul(){
		ans = number1 * number2;
		System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + ans);
	}
	
	void div(){
		ans = number1 / number2;
		System.out.println("Division of " + number1 + " and " + number2 + " is " + ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}	
}