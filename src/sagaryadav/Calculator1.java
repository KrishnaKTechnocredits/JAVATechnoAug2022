package sagaryadav;
class Calculator1{
	int z=10;
	void add(int x, int y){
		System.out.println("Addition is: " + (x+y+z));
	}
	
	void sub(int x, int y){
		System.out.println("Substraction is: "+ (x-y-z));
	}
		
	void div(int x, int y){
		System.out.println("Division is: " + (x/y));
	}
	
	void multiply(int x, int y){
		System.out.println("Multiplication is: " + (x*y*z));
	}
	
	public static void main (String[] args){
		Calculator1 calculator=new Calculator1();			
		calculator.add(10,20);				
		calculator.sub(30,10);
		calculator.div(60,5);
		calculator.multiply(10,30);
	}	
		
	
	
	
}
	
	