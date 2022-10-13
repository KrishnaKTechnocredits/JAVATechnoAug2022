package shubhamG.Assignment1to10;

public class Asignment2Calculator {

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
			Asignment2Calculator calculator2 = new Asignment2Calculator();
			calculator2.add(5, 10);
			calculator2.subtract(30, 10);
			calculator2.multiply(10, 10);
			calculator2.divide(20, 2);
		}

}
