// Calculator with 4 methods add,sub, mul, div, call from main() method
// local variable - accessible to that method only
package manjiri;
class Calculator{
	int num1 = 10; //instance variable - accessible to whole class
	int num2 = 5; //instance variable
	int ans = 0;
	
	void add(){
		ans = num1 + num2; 
		System.out.println("Addition is: " + ans);
	}
	
	void sub(){
		ans = num1-num2;
		System.out.println("Substraction is: " + ans);
	}
	
	void mul(){
		ans = num1*num2;
		System.out.println("Multiplication is: " + ans);
	}
	
	void div(){
		ans = num1/num2;
		System.out.println("Division is: " + ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}