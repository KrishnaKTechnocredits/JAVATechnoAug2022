package technocredits.inheritance;

public class Child1 extends Parent1{
 
	void m1(int num) {
		System.out.println(num);
	}


	public String toString() {
		return "Hi";
	}
	
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.m1(10);
		child1.m1();
	}
}
