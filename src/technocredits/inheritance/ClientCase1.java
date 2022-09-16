package technocredits.inheritance;

public class ClientCase1 {

	public static void main(String[] args) {
		A a = new A();

		System.out.println(a.x); // 10
		System.out.println(a.y); // 12
		//System.out.println(a.z);

		a.m1(); // A m1
		a.m2(); // A m2
		//a.m3();
	}
}
