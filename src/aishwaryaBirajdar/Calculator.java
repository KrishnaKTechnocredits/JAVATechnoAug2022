package aishwaryaBirajdar;

class Calculator{

	int num1 = 10;
	int num2 = 10;
	
	void add(){
		int addAns = num1 + num2;
		System.out.println("Addition is : "+addAns);
	}
	
	void sub(){
		int subAns = num1 - num2;
		System.out.println("Substraction is : "+subAns);
	}
	
	void multiply(){
		int mulAns = num1 * num2;
		System.out.println("Multiplication is : "+mulAns);
	}
 
	void divide(){
		int divAns = num1 / num2;
		System.out.println("Division is : "+divAns);
	}
	
	public static void main(String[] a){
	
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.multiply();
		cal.divide();
	
	}
	
 
}