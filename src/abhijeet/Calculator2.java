class Calculator2{
	
	void addition(int x, int y, int z){
		System.out.println("The numbers are " +x+ " , " +y+ " & " +z);
		System.out.println("Addition = "+(x+y+z));
	}	
	
	void substraction(int x, int y,int z){
		System.out.println("The numbers are " +x+ " , " +y+ " & " +z);
		System.out.println("Substraction = "+(x-y-z));
	}
	
	void multiplication(int x,int y,int z){
		System.out.println("The numbers are " +x+ " , " +y+ " & " +z);
		System.out.println("Multiplication = "+(x*y*z));
	}
	
	void division (int x,int y,int z){
		System.out.println("The numbers are " +x+ " , " +y+ " & " +z);
		System.out.println("Division = "+(x/y/z));
	}
	
	public static void main (String[] args){
		Calculator2 calculator2 = new Calculator2();
		calculator2.addition(1,2,4);
		calculator2.substraction(4,2,1);
		calculator2.multiplication(1,2,4);
		calculator2.division(4,2,1);
	}
}	