package ashishBramhe;

class A2_CalculatorEnhanced{
	
	int answer=0;
	
	void add(int n1,int n2){
		answer = n1 + n2;
		System.out.println("Addition of " + n1 + " and " + n2 + " : " + answer);
	}
	
	void subtract(int n1, int n2){
		answer = n1 - n2;
		System.out.println("Subtraction of " + n1 + " and " + n2 + " : " + answer);
	}
	
	void multiply(int n1, int n2){
		answer = n1 * n2;
		System.out.println("Multiplication of " + n1 + " and " + n2 + " : " + answer);
	}
	
	void divide(int n1, int n2){
		answer = n1 / n2;
		System.out.println("Division of " + n1 + " and " + n2 + " : " + answer);
	}
	
	public static void main(String args[]){
		A2_CalculatorEnhanced calculatorEnhanced = new A2_CalculatorEnhanced();
		calculatorEnhanced.add(5,10);
		calculatorEnhanced.subtract(10,5);
		calculatorEnhanced.multiply(5,10);
		calculatorEnhanced.divide(10,5);		
	}
}