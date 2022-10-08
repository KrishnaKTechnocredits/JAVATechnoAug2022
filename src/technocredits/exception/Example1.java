package technocredits.exception;

public class Example1 {

	void m1(int num) {
		System.out.println("Hi");
		int x = 10/num;
		System.out.println("Hello");
	}
	
	void m2(int[] num) {
		System.out.println("1");
		System.out.println(num[num.length]);
		System.out.println("2");
	}
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		int[] num = {10,20};
		example1.m1(0);
		example1.m2(num);
		System.out.println("End");
	}
}
