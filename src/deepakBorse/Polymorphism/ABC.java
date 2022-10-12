package deepakBorse.Polymorphism;

import deepakBorse.Practice.A;

public class ABC extends A {
	public static void main(String[] args) {
		m1();
		A.m1();
	}

	public static void m1() {
		System.out.print(" ABC m1");
	}
}
