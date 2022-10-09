package technocredits.exception;

public class Example2 {

	void m1(int num) {
		System.out.println("Hi");
		try {
			int x = 10/num;
			System.out.println(x);
			int y = 10 + x;
			y++;
			System.out.println(y);
		}catch(ArithmeticException ae) {
			System.out.println("3");
		}
		System.out.println("Hello");
		System.out.println("4");
	}
	
	void m2(int[] num, int length) {
		System.out.println("1");
		System.out.println(num[num.length]);
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Example2 example1 = new Example2();
		int[] num = {10,20};
		example1.m1(0);
		example1.m2(num,2);
		System.out.println("End");
	}
}
