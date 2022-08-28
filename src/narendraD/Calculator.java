package narendraD;

class Calculator {
	int number1 = 10;
	int number2 = 5;
	int result = 0;
	
	void add(){
		result = number1 + number2;
		System.out.println("Addition is " + result);
		
	}
	
	void sub(){
		result = number1 - number2;
		System.out.println("Substraction is " + result);
		
	}
	
	void mul(){
		result = number1 * number2;
		System.out.println("Multiplication is " + result);
		
	}
	
	void div(){
		result = number1 / number2;
		System.out.println("Division is " + result);
		
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}

}