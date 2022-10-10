package technocredits.exception.throwsdemo;

public class B {
	
	void m2() throws ArithmeticException{
		System.out.println(2);
		C c = new C();
		c.m3(0);
		System.out.println(3);
	}
}
