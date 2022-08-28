package aishwaryaBirajdar;

class ParamCalculator{

	
	void add(int x, int y){
		
		System.out.println(x + y);
	}
	
	void sub(int x, int y){
		int subAns = x - y;
		System.out.println("Substraction is : "+subAns);
	}
	
	void multiply(int x, int y){
		int mulAns = x * y;
		System.out.println("Multiplication is : "+mulAns);
	}
 
	void divide(int x, int y){
		int divAns = x / y;
		System.out.println("Division is : "+divAns);
	}
	
	public static void main(String[] a){
	
		ParamCalculator cal = new ParamCalculator();
		cal.add(300,500);
		cal.sub(400,200);
		cal.multiply(15,20);
		cal.divide(64,4);
	
	}
	
 
}