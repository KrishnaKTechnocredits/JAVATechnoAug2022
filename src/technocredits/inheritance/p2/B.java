package technocredits.inheritance.p2;

import technocredits.inheritance.p1.A;

public class B extends A{
	
	void processData() {
		// A obj = new A();
		B obj = new B();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		
		obj.m1();
		obj.m3();
	}
}
