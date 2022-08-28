package harshalRane;

class Calculator {
	int number1 = 10;
	int number2 = 5;
	int ans;	
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is: " + ans);
	}

	void sub(){
		ans = number1-number2;
		System.out.println("Substraction is: " + ans);
	}
	
	void mul(){
		ans = number1*number2;
		System.out.println("Multiplication is: " + ans);
	}
	
	void div(){
		ans = number1/number2;
		System.out.println("Division is: " + ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}