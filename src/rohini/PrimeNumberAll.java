package rohini;

class PrimeNumberAll {
	int count;
	int sum;
	float avg;

	void primeNum(int num) {
		boolean primeFlag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag == true) {
			System.out.println(+num);
			count++;
			sum = sum + num;
			avg = sum / count;
		}
	}

	void primeRange(int start, int end) {
		System.out.println("Prime numbers between range " + start + " and " + end + " are: ");
		for (int num = start; num <= end; num++) {
			primeNum(num);
		}
	}

	void display() {
		System.out.println("total count of prime numbers within same range: " + count);
		System.out.println("Print sum of all prime numbers within same range: " + sum);
		System.out.println("Print avg of prime numbers within same range: " + avg);
	}

	public static void main(String[] args) {
		PrimeNumberAll primeNumberAll = new PrimeNumberAll();
		primeNumberAll.primeRange(100, 120);
		primeNumberAll.display();
	}
}
