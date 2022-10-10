package technocredits.exception;

public class Example3 {

	void m1(int num) {
		System.out.println("Hi");
		int x = 0;
		try {
			x = 10/num;
		}catch(ArithmeticException ae) {
			x = 10/++num;
		}
		System.out.println(x);
		System.out.println("Hello");
	}
	
	int m2(int[] num, int index) {
		System.out.println("1");
		int targetNum = 0;
		try {
			targetNum = num[index];
		}catch(ArrayIndexOutOfBoundsException ae) {
			targetNum = num[0];
		}
		System.out.println("2");
		return  targetNum;
	}
	
	public static void main(String[] args) {
		Example3 example1 = new Example3();
		int[] num = {10,20};
		example1.m1(0);
		System.out.println(example1.m2(num,2));
		System.out.println("End");
	}
}
