package niveditaGavade;

class Calculator2{
	int ans=0;
	void add (int num1, int num2){
		ans =num1+num2;
		System.out.println("Addition is "+ans);
	}
	void sub (int num1, int num2){
		ans=num1-num2;
		System.out.println("Subtraction is "+ans);
	}
	void multi(int num1, int num2){
		ans = num1*num2;
		System.out.println("Multiplication is "+ans);
	}
	void div (int num1, int num2){
		ans =num1/num2;
		System.out.println("Division is "+ans);
	}
	
	public static void main(String[] args){
		Calculator2 cal=new Calculator2();
		cal.add(50,100);
		cal.sub(200,130);
		cal.multi(72,8);
		cal.div(72,18);
	}
}