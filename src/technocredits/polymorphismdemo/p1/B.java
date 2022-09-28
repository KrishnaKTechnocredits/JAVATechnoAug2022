package technocredits.polymorphismdemo.p1;

public class B extends A{
	
	void m2() {
		x = 1000;
	}
	
	void m4() {
		A a = new A();
		a.x = 3000;
	}
	
	void display() {
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.m3();
		b1.m2();
		b1.m4();
		A a = new A();
		
		b1.display();
		b1.display();
		System.out.println(a.x);
		System.out.println(B.x);
		System.out.println(A.x);
		C c1 = new C();
		c1.processData();
		System.out.println(C.x);
	}
}
