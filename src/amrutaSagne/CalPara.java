package amrutaSagne;
class CalPara{

	void add(int x, int y){
		System.out.println ("Addition is "+ (x+y));
	}
	
	void substract(int x, int y){
		System.out.println ("Substraction is "+ (x-y));
	}
	
	void multiplication(int x, int y){
		System.out.println ("Multiplication is "+ (x*y));
	}
	
	void division(int x, int y){
		System.out.println ("Division is "+ (x/y));
	}

	public static void main (String[] args){
		CalPara calPara = new CalPara();
		calPara.add(10,5);
		calPara.substract(10,5);
		calPara.multiplication(10,5);
		calPara.division(10,5);
	}	
}
