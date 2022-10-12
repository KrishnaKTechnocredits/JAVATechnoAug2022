package gauravSahu.exception;

public class A {
	 void m1()  throws ArithmeticException {
		 System.out.println(4);
		 B b1 = new B();
		 try {
			 b1.m2();
		 }catch(ArithmeticException ae) {
			 System.out.println("In ctach");
		 }
		 finally {
			 System.out.println("Reached");
		 }
		 System.out.println(5);
	 }
	 public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
		System.out.println("end");
	}
}
