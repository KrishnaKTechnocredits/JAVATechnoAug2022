package smitaVetal;

class Calci{
	
	void add(int a,int b){
		System.out.println("Addition of given numbers =" +(a+b)); 
	}
	
	void sub(int a,int b){
		System.out.println("Subtraction of given numbers = "+(a-b));
	}
		
	void mul(int a,int b){
	System.out.println("Multiplication of given numbers = "+(a*b));
	}
		
	void div(int a,int b){
	System.out.println("Division of given numbers = "+(a/b));
	}
	
	public static void main(String[] args){
		Calci calci  = new Calci();
		calci.add(10,20);
		calci.sub(50,70);
		calci.mul(50,60);
		calci.div(10,2);
	}
	
}