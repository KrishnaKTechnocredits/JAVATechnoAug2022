package rohanNaik.basicPrograms;
class CalculatorA{
	
	void add(int x, int y){
		System.out.println("The Addition is "+(x+y));
	}
	
	void sub(int x, int y){
		System.out.println("The Substraction is "+(x-y));
	}
	
	void mul(int x, int y){
		System.out.println("The Multiplication is "+(x*y));
	}
	
	void div(int x, int y){
		System.out.println("The Division is "+(x/y));
	}
	
	public static void main(String[] a){
		
		CalculatorA calculatora = new CalculatorA();
		calculatora.add(100,200);
		calculatora.sub(100,15);
		calculatora.mul(100,9);
		calculatora.div(100,4);
	}
}