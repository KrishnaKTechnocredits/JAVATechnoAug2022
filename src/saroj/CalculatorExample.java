package saroj;
class CalculatorExample{

	void add(int x, int y){
		System.out.println("Addition is " + (x+y));  
	}
 
	void sub(int x, int y){
		System.out.println("Subtraction is " + (x-y));  
	}
 
	void mul(int x, int y){
		System.out.println("Multiplication is " + (x*y));  
	}
 
	void div(int x, int y){
		System.out.println("Division is " + (x/y));  
	}
 
 public static void main(String[] args){
	 CalculatorExample CalculatorExample1 = new CalculatorExample();
	 CalculatorExample1.add(10,10);
	 CalculatorExample1.sub(10,5);
	 CalculatorExample1.mul(11,2);
	 CalculatorExample1.div(20,10);
	}
}