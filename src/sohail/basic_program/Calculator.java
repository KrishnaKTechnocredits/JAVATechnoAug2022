package sohail.basic_program;

class Calculator{
	int num1=10;
	int num2=5;
	
	void add(){
		int res=num1+num2;
		System.out.println("Addition is "+res);
	}
	
	void sub(){
		int res1=num1-num2;
		System.out.println("Substraction is "+res1);		
	}
	
	void mul(){
		int res3=num1*num2;
		System.out.println("Multiplication is "+res3);
	}
	
	void div(){
		int res4=num1/num2;
		System.out.println("Division is "+res4);
	}
	public static void main (String [] args){
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}	
}