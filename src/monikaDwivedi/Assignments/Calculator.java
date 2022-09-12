package monikaDwivedi;
class Calculator{	
	int number1=20; //instance variable
	int number2=10; //instance variable
	int ans = 0;
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is = " +ans);
	}
	void dif(){
		ans = number1-number2;
		System.out.println("Substraction is = " + ans);
	}
	void mul(){
		ans = number2*number1;
		System.out.println("Multiplication is = " + ans);
	}
	void div(){
		ans = number1/number2;
		System.out.println("Division is = " + ans);
	}
	public static void main(String[] args){
		Calculator cal = new Calculator();
		System.out.println("Number1 = 20, Number2 = 10");
		cal.add();
		cal.dif();
		cal.mul();
		cal.div();		
	}
}
