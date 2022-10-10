package gauravSahu.Overriding;

public class B extends A {

	int a = 10;
	int b = 20;

	void m1() {
		System.out.println("Bm1");
	}

	void m4() {
		System.out.println("Bm4");
	}

	void m5() {
		System.out.println("Bm5");
	}

	public static void main(String[] args) {
		// Case : 1
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		a1.m1();
		a1.m2();
		// Case : 2
		B b1 = new B();
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.m1();
		b1.m4();
		b1.m2();
		// Case : 3
		// B b2 = new A(); // CE, can't create object using refrence type of child clas
		
		// Case : 4
		A a = new B(); // DYNAMIC POLYMORPHISM
		a.m1();
		// a.m4(); // CE, because m4 is not overriding 
		a.m2();
		a.m3();
		a.m2();
		// a.m5(); //CE, because m5 is not overriding  
	}

}
