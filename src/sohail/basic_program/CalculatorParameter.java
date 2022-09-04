package sohail.basic_program;

class CalculatorParameter{
	int add(int a,int b){
	int c=a+b;
	System.out.println("Addition is "+ c);
	return c;
}
	int sub(int a,int b){
		int c=a-b;
		System.out.println("Addition is "+ c);
		return c;
}
	int mul(int a,int b){
		int c=a*b;
		System.out.println("Addition is "+ c);
		return c;
}
	int div (int a,int b){
		int c=a/b;
		System.out.println("Addition is "+ c);
		return c;
}
	public static void main(String [] args){
	CalculatorParameter calculatorparameter=new CalculatorParameter();
	calculatorparameter.add(10,20);
	calculatorparameter.sub(20,10);
	calculatorparameter.mul(5,4);
	calculatorparameter.div(10,2);
}
}