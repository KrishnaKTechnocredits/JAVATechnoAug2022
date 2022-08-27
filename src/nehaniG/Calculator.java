public class Calculator{
    int number1=10;
	int number2=5;
	int ans=0;
	 
	void add() {
		ans = number1+number2;
		System.out.println("Addition is: "+ans);
	}	
	
	void sub() {
		ans=number1-number2;
		System.out.println("Subtration is "+ans);
	}
	
	void multi() {
		ans= number1*number2;
		System.out.println("multiplication is "+ans);
	}
	
	void div() {
		ans=number1/number2;
		System.out.println("division is "+ans);
	}
	
	public static void main(String[] arg) {
		Calculator c1 = new Calculator();
		
		c1.add();
		c1.sub();
		c1.multi();
		c1.div();
	}
				
}
	 
	 