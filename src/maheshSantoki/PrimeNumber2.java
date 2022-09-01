package maheshSantoki;

public class PrimeNumber2 {
	int c = 0;
	int sum = 0;
	int avg = 0;

	void checkPrime(int n) {
		boolean flag = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				// System.out.println("Not Prime number");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(n + " is a Prime number");
			c++;
			sum = sum + n;
			avg = sum / c;
		}
	}

	void primeNum(int startR, int endR) {
		for (int i = startR; i <= endR; i++) {
			checkPrime(i);
		}
		System.out.println("Number of prime number in given range is : " + c);
		System.out.println("sum of prime number in given range(" + startR + "," + endR + ") : " + sum);
		System.out.println("Average of prime number in given range(" + startR + "," + endR + ") : " + avg);
	}

	public static void main(String[] a) {
		PrimeNumber2 primenumber2 = new PrimeNumber2();
		primenumber2.primeNum(100, 120);

	}
}
