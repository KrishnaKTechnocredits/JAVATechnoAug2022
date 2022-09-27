package technocredits.construtordemo;

public class B {
	
	B(String name){
		A a1 = new A(name.length());
		a1.m1();
		m1();
	}
	
	void m1() {
		System.out.println("B m1");
	}
	
	public static void main(String[] args) {
		B b1 = new B("Technocredits");
		System.out.println("Hi");
		B b2 = new B("Anvit");
	}
}
