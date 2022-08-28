

class Calculator{
	int num1=10; // instance variable
	int num2=5;
	int ans=0;
	
	void add(){
		ans= num1+num2; // local variable
		System.out.println("Addition is= "+ans);
	}
	void sub(){
		ans= num1-num2; 
		System.out.println("Subtraction is= "+ans);
	}
	void mul(){
		ans= num1*num2; 
		System.out.println("Multiplication is= "+ans);
	}
	void div(){
		ans= num1/num2; 
		System.out.println("Division is= "+ans);
	}
	
	public static void main(String args[]){
		Calculator cal=new Calculator();
		System.out.println(cal);
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
	
}