package ashishBramhe;

class A1_Calculator{
	int number1 = 10;
	int number2 = 5;
	int ans = 0;
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is " + ans);
	}
	
	void subtract(){
		ans = number1-number2;
		System.out.println("Subtraction is " + ans);
	}
	
	void multiply(){
		ans = number1*number2;
		System.out.println("Multiplication is " + ans);
	}
	
	void divide(){
		ans = number1/number2;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String args[]){
		A1_Calculator cal = new A1_Calculator();
		cal.add();
		cal.subtract();
		cal.multiply();
		cal.divide();
	}
}