package avni;

public class AllPrimeNumbers {
	int sum = 0;
	int count = 0;

	void prime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime");
			count++;
			sum += num;
		}
	}

	void printInfo() {
		System.out.println("sum of all primes is " + sum);
		System.out.println("average of all primes " + (sum / count));
	}

	void primeInRangs(int start, int end) {
		for (int i = start; i <= end; i++) {
			prime(i);
		}
	}

	public static void main(String[] args) {
		AllPrimeNumbers allPrime = new AllPrimeNumbers();
		allPrime.primeInRangs(100,150);
		allPrime.printInfo();
	}

}
