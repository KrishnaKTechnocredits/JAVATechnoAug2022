package sohail.prime_number;

public class PrimeRetun {
	int calPrime() {
		int count, sum = 0;
		boolean flag = true;
		for (int a = 2; a <= 5; a++) {
			count = 0;
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0 && a != 1) {
				sum = sum + a;
			}

		}
		System.out.println("Sum" + sum);
		return sum;
	}

	public static void main(String[] args) {
		PrimeRetun primereturn = new PrimeRetun();
		primereturn.calPrime();

	}

}
