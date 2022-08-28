package amolMule;
class Calculator{
	int num1=10;
	int num2=20;
	int ans=0;

	void addition(){
		ans=num1+num2;
		System.out.println("Addition is "+ans);
	}
	void substraction(){
		ans= num2-num1;
		System.out.println("Substraction is "+ans);
	}
	void multiplication(){
		ans= num1*num2;
		System.out.println("Multiplication is "+ans);
	}
	void division(){
		ans=num2/num1;
		System.out.println("Division is "+ans);
	}
	public static void main(String args[]){
		Calculator cal= new Calculator();
		cal.addition();
		cal.substraction();
		cal.multiplication();
		cal.division();
	}
}