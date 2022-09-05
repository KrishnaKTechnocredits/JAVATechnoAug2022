package priyankaD.Assignment1_5;

class Calculator

{
	
	
	void add(int a, int b){
		System.out.println("The numbers are"+a+","+b);
	    System.out.println("Answer is "+(a+b));
		
	}
	void sub(int a, int b){
		System.out.println("The numbers are"+a+","+b);
		System.out.println("Answer is"+(a-b));
	}
	void mul(int a, int b){
		System.out.println("The numbers are"+a+","+b);
		System.out.println("Answer is"+(a*b));
	}
	void div(int a, int b){
		System.out.println("The numbers are"+a+","+b);
		System.out.println("Answer is"+(a/b));
	}
	
		public static void main(String[]args)
		
		{
		Calculator cal =new Calculator();
		cal.add(50,30);
		cal.sub(90,10);
		cal.mul(20,70);
		cal.div(100,50);
		}
		
}