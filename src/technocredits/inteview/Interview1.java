package technocredits.inteview;

public class Interview1 {

	void m1(int x, double d) {
		System.out.println(1);
	}

	void m1(double d, int x) {
		System.out.println(2);
	}
	
	void m1(int x, int y) {
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		Interview1 interview1 = new Interview1();
		
		interview1.m1(10,10);
	}
}
