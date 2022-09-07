package harshalRane.Assignments.assignment2CalculatorWithParam;

class Cal {	
	
	void add(int a,int b){
		System.out.println("Addition is: " + (a+b));
	}

	void sub(int c,int d){
		System.out.println("Substraction is: " + (c-d));
	}
	
	void mul(int e,int f){
		System.out.println("Multiplication is: " + (e*f));
	}
	
	void div(int g, int h){
		System.out.println("Division is: " + (g/h));
	}
	
	public static void main(String[] args){
		Cal cal = new Cal();
		cal.add(50,20);
		cal.sub(100,50);
		cal.mul(10,20);
		cal.div(400,4);
	}
}