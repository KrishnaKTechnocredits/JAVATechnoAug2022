package vinod.BasicExample;
class Calculator{
	int number1=10; //instance variable
	int number2=5;
	int ans= 0;
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is "+ans);
	}
	
	void sub(){
		ans = number1-number2;
		System.out.println("sub is "+ans);
	}
	
	void mul(){
		ans = number1*number2;
		System.out.println("mul is "+ans);
	}
	
	void div(){
		ans = number1/number2;
		System.out.println("div is "+ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
	
	
	
}
