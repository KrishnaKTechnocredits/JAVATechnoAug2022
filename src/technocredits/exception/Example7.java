package technocredits.exception;

public class Example7 {

	void m1(int index, int num) {
		int[] arr = { 10, 20, 30 };
		try {
			System.out.println(index);
			System.out.println(arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(2);
			try {
				System.out.println(arr[0] / num);
			}catch(ArithmeticException ae) {
				System.out.println(6);
			}finally {
				System.out.println(7);
			}
		} catch (ArithmeticException ae) {
			System.out.println(5);
		} finally {
			try {
				System.out.println(arr[0] / num);
			}catch(ArithmeticException ae) {
				System.out.println(6);
			}finally {
				System.out.println(7);
			}
			System.out.println(3);
		}
		System.out.println(4);
	}

	public static void main(String[] args) {
		new Example7().m1(3, 0);
		System.out.println("end");
	}
}
