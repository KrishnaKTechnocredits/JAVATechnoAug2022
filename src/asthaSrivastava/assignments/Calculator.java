/*Calculator program using Parameterized method*/

package asthaSrivastava.assignments;

public class Calculator {
	
	void add(int x, int y, int z){
		System.out.println("result is "+ (x+y+z));
	}
	
	void sub(int x, int y, int z){
		System.out.println("result is "+ (x-y-z));
	}
	
	void mul(int x, int y,int z){
		System.out.println("result is "+ (x*y*z));
	}
	
	void div(int x, int y,int z){
		System.out.println("result is "+ (x/y/z));
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(100,30,10);
		calculator.sub(250,100,50);
		calculator.mul(40,54,10);
		calculator.div(100,2,1);
	}
}		