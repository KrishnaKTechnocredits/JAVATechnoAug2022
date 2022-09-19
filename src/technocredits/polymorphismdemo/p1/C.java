package technocredits.polymorphismdemo.p1;

public class C extends A{
	int x = 100;
	
	void processData() {
		System.out.println("c---" + x); // 100
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		c1.x = 0;
		new C().processData(); // 
		System.out.println(c1.x); // 0
	}
}
