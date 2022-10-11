package technocredits.abstractdemo;

public class B implements A{
	
	public void m1() {
		System.out.println("A m2");
	}
	
	public void m2() {
		System.out.println("B m2");
	}
	
	static public void m3() {
		
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		B.m3();
	}
}

// A a1 = new B();
// a1.m2();