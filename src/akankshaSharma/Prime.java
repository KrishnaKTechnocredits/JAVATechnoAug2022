package akankshaSharma;

class Prime {
	int count = 0;
	int sum = 0;

	void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num);
			count++;
			sum = sum + num;
		}
	}

	void isPrime2(int startIndex, int endIndex) {
		System.out.println("Prime numbers between " + startIndex + " and" + endIndex + " are:\n");
		for (int num = startIndex; num <= endIndex; num++) {
			isPrime(num);
		}
		System.out.println("Total count of prime numbers is " + count);
		System.out.println("Total sum of prime numbers is " + sum);
	}

	public static void main(String[] args) {
		Prime prime = new Prime();
		prime.isPrime2(100, 120);
	}
}
