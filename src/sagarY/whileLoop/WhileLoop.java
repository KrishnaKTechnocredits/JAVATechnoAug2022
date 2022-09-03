package sagarY.whileLoop;

public class WhileLoop {
	int count;

	void showPrime(int n) {
		boolean status = true;
		for (int index1 = 2; index1 <= n / 2; index1++) {
			if (n % index1 == 0) {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println(n);
			count++;
		}
	}

	void primeView(int n) {
		int num = 2;
		while (num >= 2 && count != n) {
			showPrime(num);
			num++;
		}
	}

	public static void main(String[] args) {
		WhileLoop whileLoop = new WhileLoop();
		System.out.print("First five prime numbers are: \n");
		whileLoop.primeView(5);

	}
}
