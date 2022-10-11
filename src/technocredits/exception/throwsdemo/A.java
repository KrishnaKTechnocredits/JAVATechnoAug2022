package technocredits.exception.throwsdemo;

// Maulik -> Krishna -> Harsh -> Vinod
// Maulik -> Krishna -> Harsh -> Vinod
// throws
// try / catch
public class A {
	
	void m1(){
		System.out.println(4);
		B b1 = new B();
		try {
			b1.m2();
		}catch(ArithmeticException ae) {
			System.out.println("in catch");
		}
		System.out.println(5);
	}
	
	public static void main(String[] args) {
		new A().m1();
		System.out.println("end");
	}
}
