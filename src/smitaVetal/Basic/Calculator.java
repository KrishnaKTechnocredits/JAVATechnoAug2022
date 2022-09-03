package smitaVetal.Basic;

class Calculator {
	int number1 = 10;
	int number2 = 5;
	int ans=0;
	
	void add(){
		int ans = number1+number2;
		System.out.println("Addition is " +ans);
	}
	
	void sub(){
		int ans = number1-number2;
		System.out.println("Subtraction is "+ans);
	}
	
	void mul(){
		ans =number1*number2;
		System.out.println("Multiplication is "+ans);
	}
	
	void div(){
		ans =number1/number2;
		System.out.println("Divison is "+ans);
	}
	
	public static void main(String[] args){
		Calculator C = new Calculator();
		C.add();
		C.sub();
		C.mul();
		C.div();		
	}
}