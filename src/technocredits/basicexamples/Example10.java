package technocredits.basicexamples;

public class Example10 {

	void m2() {
		short s = 320;
		byte b = 125;
		b = (byte)130;
		System.out.println(b); // -126
	}
	
	
	void m1(int x, int y) {
		double ans = (double)(x/y);
		System.out.println(ans);
		
		int x1 = -10;
		double d1 = 10.55; // 8 bytes
		float f = 10.55f; // 4 bytes
		
		double t = 10.10f;
		
		
	}
	
	public static void main(String[] args) {
		new Example10().m2();
		
	}
}
