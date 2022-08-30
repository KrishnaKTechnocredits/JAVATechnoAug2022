package harshadaJagtap;

class Calculator{
	int a=10;
	int b=5;
	int c;
	
	void add(){
		c=a+b;
		System.out.println("Addition is ="+c);
	}
	
	void sub(){
		c=a-b;
		System.out.println("Substraction is ="+c);
	}
	
	void mul(){
		c=a*b;
		System.out.println("Multiplication is ="+c);
	}
	
	void div(){
		c=a/b;
		System.out.println("Division is ="+c);
	}
	
	public static void main(String[]args){
		Calculator c1= new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}


}