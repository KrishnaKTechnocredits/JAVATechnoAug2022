package shivaniLikhia;
class Calculator {
	int number1 = 10;
	int number2 = 5;
	int ans;
	
	void add(){
		ans = number1 + number2;
		System.out.println("Addition Of two Numbers is " + ans);
	}
	
	void sub(){
		ans = number1 - number2;
		System.out.println("Subtraction Of two Numbers is " + ans);
	}
	
	void mul(){
		ans = number1 * number2;
		System.out.println("Multiplication of two Numbers is" + ans);
	}
	
	void div(){
		ans = number1 / number2;
		System.out.println("DIvision of two Numbers is " + ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		
	}
}