package technocredits.exception;

public class Example10 {

	int m1(int y) {
		
		try {
			System.out.println("Hi");
			int x = 10/y;
			System.out.println(x);
		}finally {
			System.out.println("Credits");
			//String[] arr = {"Hi"};
			//System.out.println(arr[1]);
		}
		return 100;
	}
	
	public static void main(String[] args) {
		Example10 example10 = new Example10();
		System.out.println(example10.m1(0));
		System.out.println("hello");
	}
}
