package technocredits.finaldemo;

public class B extends A{

	final static  void display() {
		A a1 = new A();
		System.out.println(a1.name);
		String name = a1.name; 
	}
	
	String m2(int x) {
		return "Hi";
	}
	
	static public void main(String[] args) {
		B.display();
	}
}
