package pujaSah.assignments1_10;

public class Calculator3 {

	void add(int x, int y) {
		int ans = x + y;
		System.out.println("Addition is " + ans);
	}

	void subtract(int x, int y) {
		int ans = x - y;
		System.out.println("Subtraction is " + ans);
	}

	void multiply(int x, int y) {
		int ans = x * y;
		System.out.println("Multiplication is " + ans);
	}

	void divide(int x, int y) {
		int ans = x / y;
		System.out.println("Division is " + ans);
	}

	public static void main(String[] args) {
		Calculator3 calculator3 = new Calculator3();
		calculator3.add(5, 10);
		calculator3.subtract(30, 10);
		calculator3.multiply(10, 10);
		calculator3.divide(20, 2);
	}
}
