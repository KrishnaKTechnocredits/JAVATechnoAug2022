package narendraD;

class CalculatorParam {
	
	void add(int x, int y){
		
		System.out.println("Addition is: " + (x+y));
		
	}
	
	void sub(int x, int y){
		
		System.out.println("Substraction is: " + (x - y));
		
	}
	
	void mul(int x, int y){
		
		System.out.println("Multiplication is: " + (x*y));
		
	}
	
	void div(int x, int y){
		
		System.out.println("Division is: " + (x/y));
		
	}
	
	public static void main(String[] args) {
		CalculatorParam calParam = new CalculatorParam();
		calParam.add(150,15);
		calParam.sub(150,15);
		calParam.mul(150,15);
		calParam.div(150,15);
	}

}