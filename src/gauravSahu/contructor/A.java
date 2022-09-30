package gauravSahu.contructor;

public class A {
	
	int x = 10;
	
	void m1() {
		final int x;
		System.out.println("A m1");
	}
	
	A(){
		System.out.println("A Constr");
	}
	
	A(int a, int b ){
		System.out.println("A Constr");
	}
	
	A(String name, int c){
		System.out.println("A Constr");
	}

}
