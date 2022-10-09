package technocredits.exception;

public class Example8 {

	void m1() {
		try {
			System.out.println(2);
			try {
				double[] arr = {10.20, 30.30};
				System.out.println(arr[0] + arr[1] + arr[2]);
				System.out.println(3);
			}catch(ArrayIndexOutOfBoundsException ne) {
				System.out.println(4);
			}
			System.out.println(5);
		}catch(ArithmeticException ae) {
			System.out.println(1);	
		}catch(Exception e) {
			System.out.println(7);
		}
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		new Example8().m1();
	}
}
