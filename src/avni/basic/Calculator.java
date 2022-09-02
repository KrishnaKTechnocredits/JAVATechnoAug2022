//assinment2
package avni.basic;
class Calculator{
	
	void add(int x,int y){
		System.out.println("addition is "+(x+y));
	}
	
	void sub(int x,int y){
		System.out.println("substration is "+(x-y));
	}
	
	void multi(int x,int y){
		System.out.println("multiplication is "+(x*y));
	}
	
	void div(int x,int y){
		System.out.print("division is "+(x/y));
	}
	
	public static void main(String[] arg){
		Calculator calculator1 = new Calculator();
		calculator1.add(5,6);
		calculator1.sub(8,4);
		calculator1.multi(7,2);
		calculator1.div(10,2);
	}
}