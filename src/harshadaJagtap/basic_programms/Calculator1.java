package harshadaJagtap.basic_programms;
//Calculator1
class Calculator1{
	
	void add(int a, int b){
		int c=a+b;
		System.out.println("Addition is ="+c);
	}
	
	void sub(int a, int b){
		int c=a-b;
		System.out.println("Substraction is ="+c);
	}
	
	void mul(int a, int b){
		int c=a*b;
		System.out.println("Multiplication is ="+c);
	}
	
	void div(int a, int b){
		int c=a/b;
		System.out.println("Division is ="+c);
	}
	
	public static void main(String[]args){
		Calculator1 calculator= new Calculator1();
		calculator.add(10,5);
		calculator.sub(10,5);
		calculator.mul(10,5);
		calculator.div(10,5);
	}
}