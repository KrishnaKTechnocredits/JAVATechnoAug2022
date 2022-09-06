package aishwaryaPawar;

class Calculator {
	int num1=50;
	int num2=10;
	
	void display(){
		System.out.println("Number1 is "+num1);
		System.out.println("Number2 is "+num2);
	}
	
	void add(){
		int num= num1 + num2;
		System.out.println("Addition is "+num);
	}
	
	void sub(){
		int num=num1 - num2;
		System.out.println("Substraction is "+num);
	}
	
	void mul(){
		int num=num1 * num2;
		System.out.println("Multiplication is "+num);
	}
	void div(){
		int num=num1 / num2;
		System.out.println("Division is "+num);
	}
	
	public static void main(String[] arg){
		Calculator calculator =new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
		
	}
}

	
