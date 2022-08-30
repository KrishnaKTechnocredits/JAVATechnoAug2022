package rashmiG;

class Cal{
	
	void add(int a, int b){
		System.out.println("Addition is "+(a+b));
	}
	
	void sub(int a, int b){
		System.out.println("Sub is "+(a-b));
	}
	
	void mul(int a, int b){
		System.out.println("Mul is "+(a*b));
	}
	
	void div(int a, int b){
		System.out.println("Div is "+(a/b));
	}
	
	public static void main(String[] args){
		Cal cal = new Cal();
		cal.add(10,20);
		cal.sub(10,30);
		cal.mul(10,0);
		cal.div(78,2);
		
	}
}