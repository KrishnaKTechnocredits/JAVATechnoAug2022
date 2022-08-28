package shubhamG;

class Calculator{
	int num1 =15;
	int num2 =5;
	int answer=0;
	
	void add(){
		answer=num1+num2;
		System.out.println("Addition is " +answer);
	}
	
	void subtract(){
		answer=num1-num2;
		System.out.println("Subtraction is " +answer);
	}

	void multiply(){
		answer=num1*num2;
		System.out.println("Multiplication  is " +answer);
	}
	
	void division(){
		answer=num1/num2;
		System.out.println("Divieion  is " +answer);
	}


	public static void main(String args[]){
		Calculator calculator= new Calculator();
		
		calculator.add();
		calculator.subtract();
		calculator.multiply();
		calculator.division();
	}

}