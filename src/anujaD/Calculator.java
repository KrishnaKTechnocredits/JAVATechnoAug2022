package anujaD;

class Calculator{
	
	int number1= 10;
	int number2= 5;
	int ans;
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is: " + ans);
	}
	
	void Sub(){
		ans = number1-number2;
		System.out.println("Substraction is: " + ans);
	}
	
	void Mul(){
		ans = number1*number2;
		System.out.println("Multiplication is: " + ans);
	}
	
	void div(){
		int ans = number1%number2;
		System.out.println("Division is: " + ans);
	}
	
	public static void main (String[] a){
		Calculator C = new Calculator();
		C.add();
		Calculator C1 = new Calculator();
		C1.Sub();
		Calculator C2 = new Calculator();
		C2.Mul();
		Calculator C3 = new Calculator();
		C3.div();
	}
}
	
	