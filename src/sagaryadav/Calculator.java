package sagaryadav;

class Calculator{
	int num1=50;
	int num2=40;
	int ans=0;
	
	void add(){
		ans= num1+num2;
		System.out.println("Addition is: " +ans);
	}
	
	void sub(){
		ans=num1-num2;
		System.out.println("Substraction is: "+ans);
	}
		
	void div(){
		num1=30;
		num2=10;
		ans=num1/num2;
		System.out.println("Division is: " +ans);
	}
	
	void multiply(){
		ans=num1*num2;
		System.out.println("Multiplication is: " +ans);
	}
	
	public static void main (String[] args){
		Calculator c1=new Calculator();			
		c1.add();				
		c1.sub();
		c1.div();
		c1.multiply();
	}	
		
	
	
	
}
	
	