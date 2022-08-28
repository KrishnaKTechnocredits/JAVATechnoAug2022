package amolMule;
class Calculator1{
	
	void add(int x, int y){
		System.out.println("Addition is" +(x+y));
	}

	void sub(int x, int y){
		System.out.println("Sub is" +(x-y));
	}

	void mult(int x, int y){
		System.out.println("Sub is" +(x*y));
	}

	void div(int x, int y){
		System.out.println("Sub is" +(x*y));
	}
	
	public static void main(String args[]){
		Calculator1 calculator1= new Calculator1();
		calculator1.add(10,20);
		calculator1.sub(20,10);
		calculator1.mult(10,5);
		calculator1.div(10,2);
	}
}