package swapnilMaheshwari.PrimeNumberAllPrograms;

public class PrimeNumInRangeOptimized {
	int count = 0, sum = 0, avg;

	void primeNumber(int num) {

		boolean status = true;
		for (int i = 2; i <=num/2; i++) {
			if (num % i == 0) {
				// System.out.println(num + " is not a prime number\n");
				status = false;
				break;
			}

		}
		if (status == true) {
			System.out.println(num + " is Prime Number");
			count++;
			sum = sum + num;
			status = true;
		}
	}

	void primeOptimized(int startRange, int endRange) {
		for (int i = startRange; i <=endRange; i++) {
			primeNumber(i);
		}
		System.out.println("Total count of prime number is" + count);
		avg = sum / count;
		System.out.println("Average of total count" + avg);
	}

	public static void main(String[] args) {
		PrimeNumInRangeOptimized primeNumInRangeOptimized = new PrimeNumInRangeOptimized();
		// primeNumInRangeOptimized.primeNumber(11);
		primeNumInRangeOptimized.primeOptimized(2, 5);
	}

}
