// Assignment:2
//Mahesh santoki
package maheshSantoki;
class Calculator2{

	void add(int x,int y){
		System.out.println("Addition is " + (x+y));
	}
	void sub(int x,int y){
		System.out.println("Substraction is " + (x-y));
	}
	void mul(int x,int y){
		System.out.println("Multiplication is " + (x*y));
	}
	void div(int x,int y){
		System.out.println("division is " + (x/y));
	}
	public static void main(String[] args){
		Calculator2 cal2 = new Calculator2();
		cal2.add(25,6);
		cal2.sub(11,5);
		cal2.mul(2,6);
		cal2.div(6,3);
	}
}