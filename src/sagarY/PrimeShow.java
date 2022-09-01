package sagarY;

class PrimeShow {
	int count;
	int sum;
	int average;

	void showPrime(int num1) {
		boolean status = true;
		for (int index = 2; index <= Math.sqrt(num1); index++) {
			if (num1 % index == 0) {
				status = false;
				break;
			}
		}
		if (status == true) {
			count = count + 1;
			System.out.print(num1 + ",  ");
			sum = sum + num1;
			average = sum / count;
		}
	}

	void show(int num1, int num2) {
		for (int index = num1; index <= num2; index++) {
			showPrime(index);
		}
		System.out.println();
		System.out.println("Count of Prime numbers is:  " + count);
		System.out.println("Sum of the prime numbers is:  " + sum);
		System.out.println("Average of sum is:  " + average);
	}

	public static void main(String[] args) {
		PrimeShow primeList = new PrimeShow();
		System.out.println("Prime Numbers between 100 to 120 are   :");
		primeList.show(100, 120);
		System.out.println();
	}
}
