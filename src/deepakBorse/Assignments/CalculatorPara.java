package deepakBorse.Assignments;

class CalculatorPara{
	
	
	void add(int x, int y, int z){
		System.out.println("Input value of x="+x);
		System.out.println("Input value of y="+y);
		System.out.println("Input value of z="+z);
		System.out.println("Addition of x+y="+(x+y));
		System.out.println("--------------------------");
	}

	void sub(int x, int y, int z){
		System.out.println("Input value of x="+x);
		System.out.println("Input value of y="+y);
		System.out.println("Input value of z="+z);
		System.out.println("Subtraction of x-y-z="+(x-y-z));
		System.out.println("--------------------------");
	}
	
	void mul(int x, int y, int z){
		System.out.println("Input value of x="+x);
		System.out.println("Input value of y="+y);
		System.out.println("Input value of z="+z);
		System.out.println("Multipilcation of x*y*z="+(x*y*z));
		System.out.println("--------------------------");
	}
	void div(int x, int y, int z){
		System.out.println("Input value of x="+x);
		System.out.println("Input value of y="+y);
		System.out.println("Input value of z="+z);
		System.out.println("Division of x/z="+(x/z));
		System.out.println("--------------------------");
	}
	
	public static void main(String[] args){
		CalculatorPara CalPar1= new CalculatorPara();
		CalPar1.add(10,20,30);
		CalPar1.sub(1000,200,150);
		CalPar1.mul(5,10,15);
		CalPar1.div(75,0,5);
		
	}
	

}