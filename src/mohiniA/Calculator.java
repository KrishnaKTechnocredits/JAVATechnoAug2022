package mohiniA;

//Calculator to add,substract,divide,mult

class Calculator{
	int number1=10;
	int number2=5;
	
	void add(){
		int ans = number1+number2;
		System.out.println("Addition is : " + ans);		
	}

	void substract(){
		int ans = number1-number2;
		System.out.println("Substraction is : " + ans);
	}
	
	void divide(){
		int ans = number1/number2;
		System.out.println("Division is : " + ans);
	}
	
	void mult(){
		int ans = number1*number2;
		System.out.println("Multiplication is : "+ ans);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add();
		cal.substract();
		cal.divide();
		cal.mult();
	}
}