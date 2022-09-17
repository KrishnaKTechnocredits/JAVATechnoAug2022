package technocredits.inheritance;

public class ClientCase2 {

	public static void main(String[] args) {
		B b1 = new B();

		System.out.println(b1.x); // 10
		System.out.println(b1.y); // 20
		System.out.println(b1.z); // 30

		b1.m1(); // A m1
		b1.m2(); // B m2
		b1.m3(); // B m3
	}
}
