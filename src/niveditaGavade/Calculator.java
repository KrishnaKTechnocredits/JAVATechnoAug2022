package niveditaGavade;

class Calculator {
	int number1 =10;
	int number2 =5;
	
	void add (){
		int ans =number1+number2;
		System.out.println("Addition is "+ans);
	}
	
	void sub (){
		int ans=number1-number2;
		System.out.println("Subtraction is "+ans);
	}
	
	void multi(){
		int ans = number1*number2;
		System.out.println("Multiplication is "+ans);
	}
	
	void div (){
		int ans =number1/number2;
		System.out.println("Division is "+ans);
	}
	public static void main(String[] args){
		Calculator cal=new Calculator();
		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
	}
}