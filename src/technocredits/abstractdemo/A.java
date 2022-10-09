package technocredits.abstractdemo;

public interface A {

	void m1();
	
	default void m2() {
		System.out.println("A m2");
	}
	
	static void m3() {
		System.out.println("A m3");
	}
}
