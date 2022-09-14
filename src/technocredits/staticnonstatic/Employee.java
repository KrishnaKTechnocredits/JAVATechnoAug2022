package technocredits.staticnonstatic;

public class Employee {

	static int x = 10;
	void m1() {
		System.out.println("Employee m1 : Non static method");
	}
	
	static void m2() {
		System.out.println("Employee : m2 - static method");
	}
}
