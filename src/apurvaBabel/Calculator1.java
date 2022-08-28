package apurvaBabel;

class Calculator1{
	int ans = 0;
	
	void add(int x ,int y){
		ans = x+y;
		System.out.println("Addition is " + ans);
	}
	
	void subtract(int x ,int y){
		ans = x-y;
		System.out.println("Subtraction is " + ans);
	}
	
	void multiply(int x ,int y){
		ans = x*y;
		System.out.println("Multiplication is " + ans);
	}
	
	void divide(int x ,int y){
		ans = x/y;
		System.out.println("Division is " + ans);
	}
	
	public static void main(String[] args){
		Calculator1 calculator = new Calculator1();
		calculator.add(15,32);
		calculator.subtract(50,28);
		calculator.multiply(12,14);
		calculator.divide(100,20);
	}
}