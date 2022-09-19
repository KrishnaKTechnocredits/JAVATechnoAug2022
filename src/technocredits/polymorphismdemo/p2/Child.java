package technocredits.polymorphismdemo.p2;

import technocredits.polymorphismdemo.p1.Parent;

public class Child extends Parent{
	
	public void m1() {
		System.out.println("Hi");
		//return "Hi";
	}
	
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.m1();
	}
	
}
