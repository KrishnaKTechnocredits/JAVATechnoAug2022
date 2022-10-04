package shridharKumbhar;

class Calculator{
	int num1 = 10;
	int num2 = 20;
	int ans ;
	
	void add(){
		ans = num1 + num2;
		System.out.println("Addition of two num is: " + ans);
	}
	
	void sub(){
		ans = num1-num2;
		System.out.println("Subtraction of two is :" + ans);
	}

	void mul(){
		ans = num1 * num2;
		System.out.println("multiplication of two number is :"+ans);
	}
	
	void div (){
		ans = num1 / num2;
		System.out.println("division of two number is :"+ans);
	}	
	
	public static void main (String[] a){
		Calculator C1 = new Calculator();
		C1.add();
		C1.sub();
		C1.mul();
		C1.div();
	}
}