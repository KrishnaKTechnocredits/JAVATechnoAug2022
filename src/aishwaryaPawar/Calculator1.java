package aishwaryaPawar;

class Calculator1{
	int ans;
	
	void add( int num1,int num2){
		ans=num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" is");
		System.out.println (ans);
	}
	
	void sub( int num1,int num2){
		ans=num1-num2;
		System.out.println("Substraction of "+num1+" and "+num2+" is");
		System.out.println (ans);
	}
	
	void mul( int num1,int num2){
		ans=num1*num2;
		System.out.println("multiplication of "+num1+" and "+num2+" is");
		System.out.println (ans);
	}
	
	void div( int num1,int num2){
		ans=num1/num2;
		System.out.println("Division of "+num1+" and "+num2+" is");
		System.out.println (ans);
	}
	
	public static void main(String[] arg){
		Calculator1 cal = new Calculator1();
		cal.add(60,45);
		cal.sub(40,10);
		cal.mul(10,100);
		cal.div(55,11);
	}
	
}