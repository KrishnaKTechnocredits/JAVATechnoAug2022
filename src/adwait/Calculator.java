package adwait;

class Calculator {
	//int number1=10; // instance variable
	//int number2=5;	//instance variable
	//int ans =0;
	
	void add(int x, int y, int z){
		//int ans = x+y+z;
		System.out.println("Addition of numbers is "+(x+y+z));
	}
	
	void sub(int x, int y){
		//int ans = x-y;
		System.out.println("Substraction of numbers is "+(x-y));
	}
	
	void mul(int x, int y){
		//int ans = x*y;
		System.out.println("Multiplication of numbers is "+(x*y));
	}
	
	void div(int x, int y){
		//int ans = x/y;
		System.out.println("Division of the numbers is "+(x/y));
	}
	
	public static void main (String[] args){
		Calculator cal = new Calculator ();
		cal.add(10,20,30);
		cal.sub(70,30);
		cal.mul(7,5);
		cal.div(20,5);
	}
}