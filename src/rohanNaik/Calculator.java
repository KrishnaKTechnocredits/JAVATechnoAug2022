package rohanNaik;

class Calculator{
	int number1=100;
	int number2=20;
	int ans=0;
	
	void add(){
		ans=number1+number2;
		System.out.println("Addition is "+ans);
	}
	
	
	void sub(){
		ans=number1-number2;
		System.out.println("Subtraction is "+ans);
	}
	
	
	void mul(){
		ans=number1*number2;
		System.out.println("Multiplication is "+ans);
	}
	
	
	void div(){
		ans=number1/number2;
		System.out.println("Division is "+ans);
	}
	
	public static void main(String[] a){
		Calculator c1=new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
	}
}