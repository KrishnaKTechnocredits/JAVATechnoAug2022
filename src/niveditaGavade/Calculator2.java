package niveditaGavade;

class Calculator2 {
	int number1 =10;
	int number2 =5;
	int ans=0;
	
	void add (){
		int ans =number1+number2;
	}
	
	void sub (){
		int ans=number1-number2;
	}
	
	void multi(){
		int ans = number1*number2;
	}
	
	void div (){
		int ans =number1/number2;
	}
	void display(){
		System.out.println("Addition is "+ans);
		System.out.println("Subtraction is "+ans);
		System.out.println("Multiplication is "+ans);
		System.out.println("Division is "+ans);
	}
	public static void main(String[] args){
		Calculator2 cal=new Calculator2();
		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
	}
}