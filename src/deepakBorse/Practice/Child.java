package deepakBorse.Practice;

public class Child extends Parent {

	public static void m1() {
		System.out.println("Child static m1");
		
	}
	public static void main(String[] args) {
		Child child=new Child();
		Child.m1();

	}

}
