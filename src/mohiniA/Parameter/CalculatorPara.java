package mohiniA.Parameter;

class CalculatorPara{
	
	void add(int x,int y){
		int ans = x+y;
		System.out.println("Addition is : " + ans);		
	}

	void substract(int x,int y){
		int ans = x-y;
		System.out.println("Substraction is : " + ans);
	}
	
	void divide( int x,int y){
		int ans = x/y;
		System.out.println("Division is : " + ans);
	}
	
	void mult(int x,int y){
		int ans = x*y;
		System.out.println("Multiplication is : "+ ans);
	}
	
	public static void main(String[] args) {
		CalculatorPara cal = new CalculatorPara();
		cal.add(10,20);
		cal.substract(50,20);
		cal.divide(20,10);
		cal.mult(10,0);
	}
}