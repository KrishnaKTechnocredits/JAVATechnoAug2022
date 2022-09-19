package rashmiG;

class Calculator{
	int number1=10; //instance variable
	int number2=5; //instance variable
	int ans; //instance variable
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is "+ans);
	}
	
	void sub(){
		ans = number1-number2;
		System.out.println("Sub is "+ans);
	}
	
	void mul(){
		ans = number1*number2;
		System.out.println("Mul is "+ans);
	}
	
	void div(){
		ans = number1/number2;
		System.out.println("Div is "+ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		
	}
}