package gauravSahu.Overriding;

public class A {

	int x = 10;
	int y = 20;

	void m1() {
		System.out.println("Am1");
	}

	void m2() {
		System.out.println("Am2");
	}

	void m3() {
		System.out.println("Am3");
	}

	public static void main(String[] args) {
		// Case : 1
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		a1.m1();
		a1.m2();
	}
}
