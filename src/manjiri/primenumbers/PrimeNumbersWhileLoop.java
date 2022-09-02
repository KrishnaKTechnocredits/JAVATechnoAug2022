package manjiri.primenumbers;

public class PrimeNumbersWhileLoop {

	void checkPrimeNumber(int n) {
		int i = 1;
		int num = 2;

		while (i <= n) {
			boolean flag = true;
			for (int index = 2; index <= Math.sqrt(num); index++) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(num + " " + "is a prime number");
				i++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		new PrimeNumbersWhileLoop().checkPrimeNumber(5);

	}
}
